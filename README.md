## Video Game Database
The purpose of this app is for users to create, view and review video game information. Users can also create genres and platforms and associate them with a video game. 

## Requirements
JDK 1.8
Maven 4

## Running application locally
There are multiple ways to run a Spring Boot application on your local machine. One way is to execute the main method in the VideoGameDatabaseApiApplication.java class from your IDE.

You can also run it from the command prompt with the Spring Boot Maven plugin:

mvn spring-boot:run

### Application
The application takes 5 different tables featuring users, video game names, platforms, genres and reviews. The platform and genre entities have a many to many relationship with the video game entity. The review entity has a many to one relationship with users and video games. See image below for entity diagram.

### Entity Diagram
![Entity Diagram](https://user-images.githubusercontent.com/69730667/103161822-cdecf800-47a4-11eb-943c-1f4b524247a9.png)


### User Requests
* POST http://localhost:8080/users/register
* POST http://localhost:8080/users/login
* GET http://localhost:8080/users/{id}
* PUT http://localhost:8080/users/{id}
* DELETE http://localhost:8080/users/{id}

### VideoGameName Requests
* POST http://localhost:8080/videoGameNames
* GET http://localhost:8080/videoGameNames/{gameId}
* DELETE http://localhost:8080/videoGameNames/{gameId}

### Review Requests
* POST http://localhost:8080/users/{userId}/videGameNames/{gameId}/reviews
* GET http://localhost:8080/users/{userId}/videGameNames/{gameId}/reviews/{reviewId}
* PUT http://localhost:8080/users/{userId}/videGameNames/{gameId}/reviews/{reviewId}
* DELETE http://localhost:8080/users/{userId}/videGameNames/{gameId}/reviews/{reviewId}

### Genre Requests
* POST http://localhost:8080/genres
* GET http://localhost:8080/genres/{genreId}
* DELETE http://localhost:8080/genres/{genreId}

### Platform Requests
* POST http://localhost:8080/platforms
* GET http://localhost:8080/platforms/{platformId}
* DELETE http://localhost:8080/platforms/{platformId}
