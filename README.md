# postech-parquimetro
# Parquímetro API

Aplicativo de gerenciamento de reservas e vagas de parquímetros. Esta API permite criar, listar, atualizar e excluir reservas e vagas, integrando um sistema de documentação interativo via Swagger.

---

## **Recursos Principais**

- **Reserva de Parquímetros:**
  - Criar, listar, atualizar e excluir reservas.
  - Consultar tempo restante de uma reserva.
  - Adicionar tempo à reserva existente.

- **Gerenciamento de Vagas:**
  - Criar e listar vagas.
  - Consultar vaga por ID.

- **Swagger/OpenAPI:**
  - Documentação interativa acessível em `http://localhost:8080/swagger-ui.html`.

- **Docker:**
  - Implementação via `Dockerfile` e `docker-compose.yml` para execução local.

---

## **Requisitos**

- **Java 17**
- **Maven 3.8+**
- **MongoDB** (local ou em contêiner Docker)
- **Docker** (opcional, para execução via contêiner)

---

## **Como Rodar Localmente**

### **1. Configurar o Banco de Dados MongoDB**

#### Usando MongoDB Local:
Certifique-se de que o MongoDB está rodando:
```bash
sudo systemctl start mongod
```

#### Usando Docker para MongoDB:
```bash
docker run -d -p 27017:27017 --name mongodb mongo:latest
```

---

### **2. Executar a API Localmente**

#### Passo 1: Clonar o Repositório
```bash
git clone <URL_DO_REPOSITORIO>
cd <PASTA_DO_PROJETO>
```

#### Passo 2: Configurar o Banco de Dados no `application.properties`
Certifique-se de que o arquivo `src/main/resources/application.properties` está configurado para conectar ao MongoDB:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/parquimetro
```

#### Passo 3: Rodar a Aplicação
```bash
mvn clean spring-boot:run
```

A API estará acessível em:
```
http://localhost:8080
```

---

### **3. Executar com Docker Compose**

#### Passo 1: Construir a Imagem Docker
```bash
docker build -t parquimetro-service:latest .
```

#### Passo 2: Subir os Contêineres
```bash
docker-compose up -d
```

Acesse a API em:
```
http://localhost:8080
```

---

## **Endpoints Principais**

### **Reservas**

- **Criar Reserva:**
  - **POST** `/reservas`
  - Exemplo de corpo da requisição:
    ```json
    {
      "tempoSolicitadoMinutos": 60,
      "status": "PENDENTE",
      "vaga": { "id": "123" }
    }
    ```

- **Listar Reservas:**
  - **GET** `/reservas`

- **Consultar Reserva por ID:**
  - **GET** `/reservas/{id}`

- **Atualizar Reserva:**
  - **PUT** `/reservas/{id}`
  - Exemplo de corpo da requisição:
    ```json
    {
      "tempoSolicitadoMinutos": 90,
      "status": "CONFIRMADA"
    }
    ```

- **Excluir Reserva:**
  - **DELETE** `/reservas/{id}`

### **Vagas**

- **Criar Vaga:**
  - **POST** `/vagas`
  - Exemplo de corpo da requisição:
    ```json
    {
      "numero": 34
      "regiao": {"nome": "Sul"}
    }
    ```

- **Listar Vagas:**
  - **GET** `/vagas`

- **Consultar Vaga por ID:**
  - **GET** `/vagas/{id}`

---

## **Documentação Swagger**
A documentação interativa pode ser acessada em:
```
http://localhost:8080/swagger-ui.html
```

---

## **Configurações do Projeto**

### Dependências Principais
- **Spring Boot**
- **MongoDB**
- **Springdoc OpenAPI (Swagger)**
- **Lombok**
- **Docker**
 
