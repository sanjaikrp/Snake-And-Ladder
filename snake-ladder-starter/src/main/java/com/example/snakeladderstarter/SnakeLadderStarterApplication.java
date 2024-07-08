package com.example.snakeladderstarter;

import com.example.snakeladderstarter.controllers.GameController;
import com.example.snakeladderstarter.game.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnakeLadderStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakeLadderStarterApplication.class, args);

        GameController gameController = new GameController();
        Game game = gameController.startGame();
        gameController.playGame(game);

    }

}
