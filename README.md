# CRM - Sistema de Gestão de Clientes

Sistema de CRM (Customer Relationship Management) desenvolvido em Java com Spring Boot, para gerenciamento de clientes e histórico de interações. Projeto de portfólio com foco em API REST, JPA e boas práticas.

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Bean Validation
- MySQL
- Maven

## Funcionalidades

- Cadastro, listagem, atualização e exclusão de clientes (CRUD completo)
- Cadastro, listagem, atualização e exclusão de interações (ligações, reuniões, e-mails)
- Vínculo entre cliente e suas interações (relacionamento um-para-muitos)
- Validação de campos obrigatórios e formato de e-mail

## Como executar o projeto

### Pré-requisitos
- Java 17 ou superior
- MySQL instalado e rodando
- Maven (ou use o `mvnw` incluso no projeto)

### Passos

1. Clone o repositório
```bash
git clone https://github.com/Leandro2v1/crm-java-spring.git
```

2. Crie o banco de dados no MySQL
```sql
CREATE DATABASE crm_db;
```

3. Configure a variável de ambiente `DB_PASSWORD` com a senha do seu usuário MySQL

4. Rode a aplicação
```bash
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080`

## Endpoints da API

### Clientes
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /clientes | Lista todos os clientes |
| POST | /clientes | Cadastra um novo cliente |
| PUT | /clientes/{id} | Atualiza um cliente |
| DELETE | /clientes/{id} | Remove um cliente |

### Interações
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | /interacoes | Lista todas as interações |
| POST | /interacoes | Cadastra uma nova interação |
| PUT | /interacoes/{id} | Atualiza uma interação |
| DELETE | /interacoes/{id} | Remove uma interação |

## Autor

Leandro