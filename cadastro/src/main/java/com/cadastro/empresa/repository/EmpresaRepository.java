package com.cadastro.empresa.repository;

import com.cadastro.empresa.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, String> {
    Empresa findByCnpj(String cnpj);
    Empresa findByRazaoSocial(String razao_social);
}
