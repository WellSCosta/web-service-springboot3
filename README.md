# Web Service | Spring Boot 3 | Udemy

Projeto de estudo a partir do curso **"Java COMPLETO" da Udemy, com o professor Nelio Alves**.

- Este projeto é um **web service** desenvolvido com **Spring Boot 3**, que implementa uma **API RESTful**.
- O objetivo é fornecer um modelo simples para a criação de um web service robusto, escalável e fácil de manter, utilizando as melhores práticas do framework Spring.

## Funcionalidades

- **CRUD de usuários**: O projeto oferece endpoints para criar, ler, atualizar e deletar informações de usuários.
- **Tratamento de erros**: Utiliza `@ControllerAdvice` para capturar e retornar mensagens de erro apropriadas.
- **Integração com banco de dados**: Configurado para utilizar JPA e um banco de dados relacional.
- **Deploy fácil**: Pronto para deploy em servidores como WildFly e outros compatíveis.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database (em memória)** para testes e desenvolvimento local
- **Maven** para gerenciamento de dependências

## Pré-requisitos

Para rodar este projeto, você precisará ter instalado em sua máquina:

- **JDK 17** ou superior
- **Maven**
- **Git** (para clonar o repositório)

## Endpoints Principais

| Método | Endpoint       | Descrição                      |
|--------|----------------|--------------------------------|
| GET    | `/users`       | Retorna todos os usuários      |
| GET    | `/users/{id}`  | Retorna um usuário pelo ID     |
| POST   | `/users`       | Cria um novo usuário           |
| PUT    | `/users/{id}`  | Atualiza um usuário existente  |
| DELETE | `/users/{id}`  | Remove um usuário              |

### Método GET `/users`
<p align="left" >
     <img width="500" heigth="500" src="https://github.com/user-attachments/assets/bd1228be-d7c5-4e74-86ec-d39604cf66d6">
</p>

### Método GET `/orders`
<p align="left" >
     <img width="500" heigth="500" src="https://github.com/user-attachments/assets/d418b8d8-2662-4295-a5d5-237e832b32af">
</p>
<p align="left" >
     <img width="500" heigth="500" src="https://github.com/user-attachments/assets/db91a951-5339-41ba-80c2-d13717711222">
</p>

### Método GET `/products`
<p align="left" >
     <img width="500" heigth="500" src="https://github.com/user-attachments/assets/b8244741-1ead-475d-b612-803931140d76">
</p>

### Método POST `/users`
<p align="left" >
     <img width="500" heigth="500" src="https://github.com/user-attachments/assets/760b298f-36f3-473b-bc07-0c0418224bab">
</p>

### Método DELETE `/users/{id}`
<p align="left" >
     <img width="500" heigth="500" src="https://github.com/user-attachments/assets/7c2799b7-8b4d-4a63-a0f2-e190fb320133">
</p>

## Contato

E-mail: wellscostaofc@gmail.com

LinkedIn: https://www.linkedin.com/in/wellington-santos-backend-java/
