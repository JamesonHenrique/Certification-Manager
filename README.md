NLW - Trilha Java
💻 Sobre o projeto
O projeto NLW - Trilha Java é uma aplicação back end em Java e utiliza banco de dados relacional PostgreSQL. O objetivo é construir uma API RESTful que permita gerenciar certificaçoes de estudantes ao responder questões.



🔧 Tecnologias utilizadas

Java 
Spring Boot
PostgreSQL
JPA / Hibernate
Docker
Swagger

## Como usar

1. Clone este repositório:

```bash
git clone https://github.com/JamesonHenrique/User-Management.git
```

2. Abra o projeto em seu IDE
   
4. Altere o usuario e senha para que o projeto possa acessar o banco mysql.

      Vá até /src/main/resources/application.properties;

      Altere as propriedades informado o usuário e senha do seu banco de dados:
   

      spring.datasource.username=usuario

      spring.datasource.password=usuario
6. Crie o banco de dados utilizando o Docker:
```bash
docker-compose up -d
```

. Compile e execute o projeto

. Use o Swagger de preferencia para testar a api ou o que você preferir
   
      http://localhost:8080/swagger-ui/index.html
