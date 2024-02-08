# Sistema de Cadastro e Certificação de Alunos

## Descrição
Este é um projeto desenvolvido em Java com Spring Boot, PostgreSQL como banco de dados e Docker Compose para gerenciamento de containers. O objetivo é criar um sistema de cadastro e certificação de alunos. Os alunos podem se cadastrar, realizar provas e obter certificados de conclusão.

## Funcionalidades
- Cadastro de Alunos: Os alunos podem se cadastrar no sistema fornecendo informações básicas, como nome, e-mail e senha.
- Autenticação: Os alunos podem fazer login no sistema utilizando suas credenciais.
- Provas: Os alunos podem acessar e realizar provas disponíveis no sistema.
- Certificados: Após a conclusão bem-sucedida de uma prova, os alunos recebem certificados de conclusão.

## Requisitos
- Docker
- Docker Compose

## Configuração
1. Certifique-se de ter o Docker e o Docker Compose instalados em sua máquina.
2. Clone este repositório: 
    ```sh
    git clone https://github.com/seu-usuario/projeto-cadastro-certificacao.git
    ```
3. Navegue até o diretório do projeto:
    ```sh
    cd projeto-cadastro-certificacao
    ```

## Execução
1. No diretório raiz do projeto, execute o comando abaixo para iniciar os containers:
    ```sh
    docker-compose up
    ```
2. Aguarde até que todos os serviços estejam em execução.

## Uso
- Uma vez que os containers estejam em execução, o aplicativo estará disponível em [http://localhost:8080](http://localhost:8080).
- Os alunos podem se cadastrar, fazer login, realizar provas e obter certificados através da interface web.

## Autor
[Seu Nome](https://github.com/carlospepato)
