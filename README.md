# NLW - Trilha Java

## Descrição do Projeto

Este projeto é uma aplicação Java desenvolvida durante a NLW (Next Level Week). Ele é um sistema de certificação que permite aos estudantes verificar se já possuem uma certificação e responder a perguntas de certificação.

## Tecnologias Utilizadas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

- Java
- Spring Boot
- PostgreSQL
- Docker

## Como Executar o Projeto

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- Git
- Java 11
- Docker
- Maven

### 🎲 Rodando o Projeto

```bash
# Clone este repositório
$ git clone https://github.com/JamesonHenrique/Certification_nlw

# Acesse a pasta do projeto no terminal/cmd

# Inicie o Docker (se necessário)
$ sudo systemctl start docker

# Execute o Docker Compose
$ docker-compose up

# Execute a aplicação em modo de desenvolvimento
$ ./mvnw spring-boot:run
. Use o Swagger de preferencia para testar a api ou o que você preferir
   
      http://localhost:8080/swagger-ui/index.html


# Contribuições são bem-vindas! 

Se você quiser melhorar este projeto de alguma forma, sinta-se à vontade para criar um fork e enviar um pull request com suas melhorias.
