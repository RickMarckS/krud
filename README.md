[SPRING_BOOT_BADGE]: https://img.shields.io/badge/Spring%20Boot-6DB33F.svg?style=for-the-badge&logo=Spring-Boot&logoColor=white
[THYMELEAF_BADGE]: https://img.shields.io/badge/Thymeleaf-005F0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white
[MYSQL_BADGE]: https://img.shields.io/badge/MySQL-4479A1.svg?style=for-the-badge&logo=MySQL&logoColor=white
[KOTLIN_BADGE]: https://img.shields.io/badge/Kotlin-7F52FF.svg?style=for-the-badge&logo=Kotlin&logoColor=white
[HTML5_BADGE]: https://img.shields.io/badge/HTML5-E34F26.svg?style=for-the-badge&logo=HTML5&logoColor=white
[BOOTSTRAP_BADGE]: https://img.shields.io/badge/Bootstrap-7952B3.svg?style=for-the-badge&logo=Bootstrap&logoColor=white
[GIT_BADGE]: https://img.shields.io/badge/Git-F05032.svg?style=for-the-badge&logo=Git&logoColor=white
<h1 align="center" style="font-weight: bold;"> KRUD 💻</h1>

![kotlin][KOTLIN_BADGE]
![thymeleaf][THYMELEAF_BADGE]
![spring][SPRING_BOOT_BADGE]
![mysql][MYSQL_BADGE]
![html5][HTML5_BADGE]
![bootstrap][BOOTSTRAP_BADGE]
![git][GIT_BADGE]


<p align="center">
<b>This project Krud (Kotlin + Crud) provides a basic CRUD model for integrations with other systems, including validation of incoming requests.
</b> <b>Additionally, this project features two frontend pages using Bootstrap for interaction with the API and Thymeleaf for rendering dynamic content.</b>
</p>

<h2 id="started">🚀 Getting started</h2>

1. Clone the repository from GitHub: https://github.com/RickMarckS/krud.git
2. Navigate to the project directory: cd krud
3. Start the MySQL database using XAMPP:
    - Open the XAMPP Control Panel
    - Click on the "Start" button next to the Apache and MySQL services
    - Wait for the services to start
4. Execute the Gradle command: ./gradlew bootRun
5. Access the project in your web browser: http://localhost:8080/home

<h3>Prerequisites</h3>

List of all prerequisites necessary for running this project.
* [Xampp](https://www.apachefriends.org/pt_br/download.html)
* [Mysql](https://www.mysql.com/downloads/)
* internet Connection to download dependecies


<h2 id="routes">📍 API Endpoints</h2>

List of all endpoints for this API.
​
| Route | Description |
| --- | --- |
| <kbd>GET /home</kbd> | Displays the main page with all registered users. |
| <kbd>GET /formulario/cadastro</kbd> | Opens the user registration form. |
| <kbd>GET /formulario/edicao/{id}</kbd> | Opens the user edit form with the specified ID. |
| <kbd>GET /excluir/{id}</kbd> | Deletes a user with the specified ID. |
| <kbd>POST /editar/{id}</kbd> | Edits and saves a user with the specified ID. |
| <kbd>POST /cadastrar</kbd> | Creates a new user. |

