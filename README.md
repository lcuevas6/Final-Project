## Video Game Database
The purpose of this app is for users to create, review and view video game information. Users can also create genres and platforms and associate them with a video game. 

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
