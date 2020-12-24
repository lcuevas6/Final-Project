package com.finalproject.video.game.database.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.finalproject.video.game.database.api")
@SpringBootApplication
public class VideoGameDatabaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoGameDatabaseApiApplication.class, args);
	}

}
//Change comment