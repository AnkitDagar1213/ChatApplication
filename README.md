# chatApplication_Project

## Frameworks and Language Used:

*Spring Boot Framework

*Java Programming Language

*MySQL Database

*Maven

## Data Flow:

### Controllers:

-UserController: Handles user registration and login requests

-ChatController: Handles chat message requests between users

-StatusController: Handles status-related requests

### Services:

-UserService: Handles user registration and login business logic

-ChatHistoryService: Handles saving chat messages and retrieving chat history for users

-StatusService: Handles status-related business logic

### Repository:

UserRepository: Communicates with the database for user-related operations

ChatHistoryRepository: Communicates with the database for chat-related operations

StatusRepository: Communicates with the database for status-related operations

## Database Design:

-User table: Contains user details such as name, email, password, and phone number

-Chat table: Contains chat messages between users, along with the sender and receiver IDs

-Status table: Contains the status details such as status name and description

## Data Structure:

JSONObject and JSONArray objects are used to handle JSON data in the application

## Project Summary:
This is a chat application built using Spring Boot framework and MySQL database. Users can register and login to the application to start chatting with other users. The application allows users to view their chat history with other users and also view the conversations between two users. The application also includes validation for user inputs such as email, password, and phone number.
