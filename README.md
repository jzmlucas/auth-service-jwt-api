<p align="center">
  <a href="" rel="noopener">
 <img width=50px height=50px src="https://spring.io/img/projects/spring-boot.svg" alt="Spring Boot Logo"></a>
</p>

<h3 align="center">API RESTful com Auth Service JWT</h3>

<div align="center">

[![Last Commit](https://img.shields.io/github/last-commit/jzmlucas/auth-service-jwt-api?style=for-the-badge)](#)
[![Status](https://img.shields.io/badge/status-active-success?style=for-the-badge)](#)

[![Java](https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=openjdk)](#)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge&logo=springboot)](#)
[![Security](https://img.shields.io/badge/Auth-JWT-blue?style=for-the-badge)](#)
[![Database](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql)](#)

</div>

---

<p align="center"> <p align="center">
API RESTful de autenticação com JWT utilizando Spring Boot, Spring Security e JPA, estruturada em arquitetura em camadas e integrada ao PostgreSQL para persistência de dados.
</p>
    <br> 
</p>

## 📝 Conteúdo

- [Primeiros passos](#getting_started)
- [Teste](#tests)
- [Utilização](#usage)
- [Construção](#built_using)
- [Arquitetura](#architecture)
- [Padrões](#pattern)
- [API](#api)
- [TODO](../TODO.md)
- [Autores](#authors)
- [Conhecimentos adquiridos](#acknowledgement)

## 🚀 Primeiros passos <a name = "getting_started"></a>

### Pré-requisitos

Antes de iniciar, você precisa ter instalado:

- Java 17+
- Maven 3.8+
- Git

Verifique se está tudo configurado:
```
java -version 
mvn -version 
git --version
```

### Instalação

#### 1 - Clonar o repositório

```
git clone https://github.com/jzmlucas/auth-service-jwt-api
```

#### 2 - Acessar o diretório do projeto

```
cd auth-service
```

#### 3 - Executar a aplicação

```
./mvnw spring-boot:run
```

Ou, se não estiver usando o wrapper:

```
mvn spring-boot:run 
```

#### 4 - Validar se a aplicação está funcionando

A aplicação estará disponível em:

http://localhost:8080

Se tudo estiver correto, o servidor Spring Boot iniciará sem erros no terminal.

##### 5 - Testar o endpoint
- [TODO](./TODO.md)



## 🧪 Realizando os testes <a name = "tests"></a>

Execute os testes da aplicação

```
mvn test
```

Realize os testes de unidade:
- [TODO](./TODO.md)

Realize os testes de integração:
- [TODO](./TODO.md)

## 📦 Utilização <a name="usage"></a>

### Fluxo da aplicação
- O cliente envia uma requisição HTTP
- O Controller recebe a requisição
- O Service processa a lógica
- O Repository fornece os dados
- A resposta é retornada ao cliente


## 🏗️ Construção <a name = "built_using"></a>

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework principal da aplicação
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Camada de persistência e abstração para acesso dos dados
- [TODO](./TODO.md) - [Spring Security](https://spring.io/projects/spring-security) - Autenticação e autorização com JWT
- [PostgreSQL](https://www.postgresql.org/) - Banco de dados relacional
- [Maven](https://maven.apache.org/) - Gerenciamento de dependências e build do projeto

## 🧱 Arquitetura <a name = "architecture"></a>

A aplicação segue uma arquitetura em camadas baseada em princípios de separação de responsabilidades:

- **Controller**
  - Exposição de endpoints REST
  - Responsável por entrada/saída (HTTP, JSON)

- **Service**
  - Contém regras de negócio
  - Organiza as chamadas entre controller e repository

- **Repository**
  - Abstrai o acesso ao banco de dados
  - Utiliza Spring Data JPA para operações CRUD e queries

- **Camada Model**
  - Contém a entidade principal da minha aplicação

## 🔁 Padrões utilizados <a name = "pattern"></a>

- **MVC (Model-View-Controller)** – Organização estrutural
- **Repository Pattern** – Isolamento do acesso a dados
- **Injeção de Dependências (IoC)** – Gerenciado pelo Spring

## 🌐 API <a name = "api"></a>

- Arquitetura RESTful
- Comunicação via JSON
- Endpoints organizados por recurso
- Uso de métodos HTTP semânticos (GET, POST, PUT, DELETE)

## - 💾 Persistência integrada com PostgreSQL

- ORM com Spring Data JPA
- Mapeamento objeto-relacional
- Integração com PostgreSQL
- Gerenciamento de transações automático

## 👤 Autor <a name = "authors"></a>

- [@jzmlucas](https://www.linkedin.com/in/jzmlucas/) - Estudo e Trabalho inicial


## 📚 Conhecimentos Adquiridos <a name = "acknowledgement"></a>

- Utilização do Framework Spring Boot
- Gerenciamento de dependências utilizando Maven
- Padrões e boas práticas de Arquitetura
- Injeção de Dependências
