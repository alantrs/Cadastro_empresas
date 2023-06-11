function cadastrarEmpresa() {
  const cnpjInput = document.getElementById('cnpj-input');
  const cnpj = cnpjInput.value;

  fetch(`empresas/confirmarEmpresa?cnpj=${cnpj}`)
    .then(response => response.json())
    .then(empresa => {
      const detalhesEmpresa = document.getElementById('detalhes-empresa');
      detalhesEmpresa.innerHTML = '';

      for (const key in empresa) {
        if (key === 'qsa') {
          const qsaItems = empresa.qsa.map(qsaItem => {
            let qsaHtml = '';
            for (const qsaKey in qsaItem) {
              qsaHtml += `<strong>${qsaKey}:</strong> ${qsaItem[qsaKey]} `;
            }
            return `<p>${qsaHtml}</p>`;
          });
          detalhesEmpresa.innerHTML += '<h5>QSA:</h5>' + qsaItems.join('');
        } else if (key === 'cnaes_secundarios') {
          const cnaeItems = empresa.cnaes_secundarios.map(cnaeItem => {
            let cnaeHtml = '';
            for (const cnaeKey in cnaeItem) {
              cnaeHtml += `<strong>${cnaeKey}:</strong> ${cnaeItem[cnaeKey]} `;
            }
            return `<p>${cnaeHtml}</p>`;
          });
          detalhesEmpresa.innerHTML += '<h5>CNAEs Secundários:</h5>' + cnaeItems.join('');
        } else {
          detalhesEmpresa.innerHTML += `<p><strong>${key}:</strong> ${empresa[key]}</p>`;
        }
      }

      // Abrir a janela modal
      document.getElementById('modal').style.display = 'block';
    })
    .catch(error => {
      console.error('Erro ao obter empresa:', error);
    });
}

function confirmarCadastro() {
    const cnpjInput = document.getElementById('cnpj-input');
    const cnpj = cnpjInput.value;

    // Salvar os dados no banco de dados
    fetch('/empresas', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ cnpj })
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao cadastrar empresa');
        }
        const confirmacaoCadastro = document.getElementById('confirmacao-cadastro');
        confirmacaoCadastro.innerHTML = '<h3>Empresa cadastrada com sucesso</h3>';

        listarEmpresas();
        cnpjInput.value = '';
        document.getElementById('modal').style.display = 'none';
        window.location.href = "empresas.html";
    })
    .catch(error => {
        console.error('Erro ao cadastrar empresa:', error);
    });
}

function listarEmpresas() {
    fetch('/empresas')
        .then(response => response.json())
        .then(data => {
            const empresasBody = document.getElementById('empresas-body');
            empresasBody.innerHTML = '';

            if (data.length === 0) {
                const row = document.createElement('tr');
                const emptyCell = document.createElement('td');
                emptyCell.colSpan = 2;
                emptyCell.textContent = 'Nenhuma empresa cadastrada';
                row.appendChild(emptyCell);
                empresasBody.appendChild(row);
            } else {
                data.forEach(empresa => {
                    const row = document.createElement('tr');
                    const cnpjCell = document.createElement('td');
                    const razaoSocialCell = document.createElement('td');

                    cnpjCell.textContent = empresa.cnpj;
                    razaoSocialCell.textContent = empresa.razao_social;

                    row.appendChild(cnpjCell);
                    row.appendChild(razaoSocialCell);
                    empresasBody.appendChild(row);
                });
            }
        })
        .catch(error => {
            console.error('Erro ao obter empresas:', error);
        });
}


document.getElementById('cadastrar-btn').addEventListener('click', cadastrarEmpresa);
document.getElementById('confirmar-btn').addEventListener('click', confirmarCadastro);
document.getElementById('ver-empresas-btn').addEventListener('click', listarEmpresas);
listarEmpresas();
