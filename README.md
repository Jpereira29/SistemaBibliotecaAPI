# Projeto Físico Sistema Biblioteca

## Equipe
<ul>
  <li>Francisco Airton Araújo Júnior  2023010960</li>
  <li>Jorge Pereira de Oliveira 2023011027</li>
  <li>Rafael Guimarães Januário 2023010600</li>
</ul>

<p>
  Este projeto implementa o sistema de gerenciamento de uma biblioteca, com funcionalidades básicas de cadastro de usuários, 
  autores, livros e gerenciamento de empréstimos. O projeto foi desenvolvido em Java utilizando Spring Boot e um banco de dados PostgreSQL. 
  O objetivo é fornecer uma aplicação simples e funcional para o controle de empréstimos de livros em uma biblioteca.
</p>

## Funcionalidades
<ul>
  <li>Cadastro de usuários</li>
  <li>Cadastro de autores</li>
  <li>Registro de livros</li>
  <li>Gerenciamento de empréstimos</li>
  <li>Controle de tipos de usuários</li>
</ul>

## Estrutura do Projeto
<p>A aplicação foi organizada em pacotes para facilitar a separação de responsabilidades e manter o código modular.</p>

```bash
ProjetoFisicoSistemaBibliotecaDb/
│
├── src/
│   └── main/
│       └── java/
│            └── biblioteca/
│                ├── controller/      # Controladores que gerenciam as requisições
│                ├── model/           # Modelos das entidades
│                ├── repository/      # Interfaces de repositório para acesso ao banco
│
├── resources/
│   └── application.properties    # Configurações da aplicação
│
└── pom.xml                       # Configurações do Maven
```

## Documentação
<p>O projeto foi documentado utilizando o Swagger, permitindo uma visualização interativa da API. Para acessar a documentação Swagger, inicie a aplicação e acesse o seguinte URL:</p>

```bash
http://localhost:8005/swagger-ui/index.html
```
![image](https://github.com/user-attachments/assets/e5d899cb-2f08-4c37-a7ce-d6619ef7263e)

