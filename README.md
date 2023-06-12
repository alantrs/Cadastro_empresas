
## Aplicação de Cadastro de CNPJ

Esta aplicação é um projeto em Spring Boot que permite cadastrar informações de CNPJ em um banco de dados local. Ela consome a API do BrasilAPI (https://brasilapi.com.br/api/cnpj/v1/{cnpj}) para obter os dados do CNPJ fornecido e armazena esses dados no banco de dados.

### Funcionalidades
Cadastro de CNPJ: Os usuários podem inserir um CNPJ na aplicação, que faz uma chamada para a API do BrasilAPI para obter os dados correspondentes. Em seguida, os dados do CNPJ são cadastrados no banco de dados local.

Armazenamento de dados: Os dados do CNPJ, como razão social, nome fantasia, endereço, entre outros, são armazenados no banco de dados local para consulta posterior.

Integração com API externa: A aplicação consome a API do BrasilAPI para obter os dados do CNPJ. Ela realiza chamadas HTTP para a API, recebe a resposta em formato JSON e extrai os dados necessários para o cadastro.

### Configuração
Antes de executar a aplicação, verifique se você possui as seguintes configurações:

Java Development Kit instalado.

Banco de dados configurado e informações de conexão atualizadas no arquivo de configuração (application.properties).

### Executando a aplicação
Siga as etapas abaixo para executar a aplicação:

Clone o repositório para o seu ambiente local.

Abra o projeto em sua IDE preferida.

Verifique as configurações do banco de dados no arquivo application.properties e atualize-as conforme necessário.

Compile e execute o projeto.

Acesse localhost:8080/index.html.

### Mockup 

