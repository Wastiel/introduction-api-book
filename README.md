# Introduction-api-book
## API Book
Este é um projeto em Spring Boot destinado a fornecer uma introdução à construção de APIs RESTful com Java. É o resultado de um programa de mentoria que estou tendo atualmente com meu mentor Jonatan através da empresa DBTec, onde estou aprendendo os conceitos básicos de desenvolvimento de uma API.

## Sobre a API BOOk
O projeto API Book simula os conceitos de uma de uma simples API, onde é possivel realizar operações CRUD(Create, Read, Update, Delete),  simples de gerenciamento de livros, onde é possível realizar operações CRUD (Create, Read, Update, Delete) em livros. Ele expõe um conjunto de endpoints que podem ser usados para interagir com o sistema, tais como:

* GET /books: Retorna uma lista de todos os livros.
* GET /books/{id}: Retorna um livro específico pelo seu ID.
* POST /books: Cria um novo livro com os dados fornecidos.
* PUT /books/{id}: Atualiza um livro com um ojeto book fornecido.
* DELETE /books/{id}: Exclui um livro com o ID fornecido.

Cada endpoint retorna um objeto JSON que representa o(s) livro(s) sendo manipulado(s), e também trata alguns erros de forma adequada, retornando  mensagens de erro.

## Executando o projeto
Para executar o projeto API Book localmente utilizando o IntelliJ IDEA e Java 17 instalado, siga os seguintes passos:

1. Clone o repositório: git clone https://github.com/Wastiel/introduction-api-book.git
2. Navegue até o diretório do projeto: cd api-book
3. Abra o IntelliJ IDEA e selecione "Open or Import" na tela inicial.
4. Navegue até o diretório onde o projeto API Book foi clonado e selecione o arquivo build.gradle.kts (ou build.gradle, dependendo da versão do Gradle utilizada no projeto).
5. Clique em "Open as Project" para abrir o projeto no IntelliJ.
6. No canto direito da tela, selecione a aba "Gradle" e clique no botão "Refresh all Gradle projects" para atualizar as dependências do projeto.
7. Em seguida, clique no botão "Run" ao lado da classe "ApiBookApplication" para executar o projeto.
8. O projeto será executado e você poderá acessar os endpoints da API enviando requisições HTTP para http://localhost:8080. Por exemplo, tente abrir http://localhost:8080/books em seu navegador web para ver uma lista de todos os livros.

Certifique-se de ter o Java 17 configurado corretamente em seu sistema antes de executar o projeto. Você pode verificar isso abrindo um terminal e digitando "java -version". Se a versão do Java exibida for 17 ou superior, você está pronto para executar o projeto. Caso contrário, será necessário instalar o Java 17 e configurar as variáveis de ambiente corretamente.

## Contribuindo
Este projeto está em sua fase final e tem como objetivo demonstrar a criação de uma API simples, com foco na praticidade e compreensão dos conceitos, sem necessariamente seguir todas as boas práticas recomendadas.

-----------------------------------------------------------------------------

# Introduction-api-book - English Version Readme

This is a Spring Boot project aimed at providing an introduction to building RESTful APIs with Java. It is the result of a mentoring program I am currently having with my mentor Jonatan through the company DBTec, where I am learning the basic concepts of API development.

## About the API Book
The API Book project simulates the concepts of a simple API, where it is possible to perform CRUD (Create, Read, Update, Delete) operations on books. It exposes a set of endpoints that can be used to interact with the system, such as:

* GET /books: Returns a list of all books.
* GET /books/{id}: Returns a specific book by its ID.
* POST /books: Creates a new book with the provided data.
* PUT /books/{id}: Updates a book with a provided book object.
* DELETE /books/{id}: Deletes a book with the provided ID.

Each endpoint returns a JSON object representing the manipulated book(s), and also handles some errors appropriately by returning error messages.

## Running the project
To run the API Book project locally using IntelliJ IDEA and Java 17 installed, follow these steps:

1. Clone the repository: git clone https://github.com/Wastiel/introduction-api-book.git
2. Navigate to the project directory: cd api-book
3. Open IntelliJ IDEA and select "Open or Import" on the initial screen.
4. Navigate to the directory where the API Book project was cloned and select the build.gradle.kts file (or build.gradle, depending on the version of Gradle used in the project).
5. Click on "Open as Project" to open the project in IntelliJ.
6. On the right-hand side of the screen, select the "Gradle" tab and click the "Refresh all Gradle projects" button to update the project's dependencies.
7. Then, click the "Run" button next to the "ApiBookApplication" class to run the project.
8. The project will run and you can access the API endpoints by sending HTTP requests to http://localhost:8080. For example, try opening http://localhost:8080/books in your web browser to see a list of all books.
9. Make sure you have Java 17 configured correctly on your system before running the project. You can check this by opening a terminal and typing "java -version". If the Java version displayed is 17 or higher, you are ready to run the project. Otherwise, you will need to install Java 17 and configure the environment variables correctly.

## Contributing
This project is in its final stage and aims to demonstrate the creation of a simple API, focusing on practicality and understanding of the concepts, without necessarily following all recommended best practices.

## Note
This README is also available in Portuguese.