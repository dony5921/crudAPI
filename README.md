#  CRUD API - Spring Boot

API REST desenvolvida em Java com Spring Boot para gerenciamento de fornecedores (CloudVendor).

##  Funcionalidades

*  Criar fornecedor
*  Buscar fornecedor por ID
*  Atualizar dados (estrutura preparada)
*  Deletar fornecedor (estrutura base)

##  Tecnologias

* Java
* Spring Boot
* Spring Web
* Maven

## 📂 Estrutura do projeto

```
controller/
  └── CloudVendorAPIService.java

model/
  └── CloudVendor.java

main/
  └── CrudApplication.java
```

## ▶️ Como executar

```bash
git clone https://github.com/dony5921/crudAPI.git
cd crudAPI
```

### Rodar aplicação

Via IDE (IntelliJ/Eclipse):

* Execute a classe `CrudApplication.java`

Ou via Maven:

```bash
mvn spring-boot:run
```

## 🌐 Endpoints

### GET - Buscar fornecedor

```http
GET /cloudvendor/{vendorId}
```

### POST - Criar fornecedor

```http
POST /cloudvendor
```

#### Exemplo de JSON:

```json
{
  "vendorId": "C1",
  "vendorName": "Fornecedor 1",
  "vendorAddress": "Endereço",
  "vendorPhoneNumber": "123456789"
}
```

##  Objetivo

Projeto desenvolvido para prática de construção de APIs REST com Spring Boot, aplicando conceitos de CRUD, organização em camadas (controller e model) e manipulação de requisições HTTP.

## 👨‍💻 Autor

Adonizedeque Gonçalves dos Santos.
