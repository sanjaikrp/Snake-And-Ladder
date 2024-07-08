package com.example.snakeladdersolution.controllers;

import com.example.snakeladdersolution.game.Game;
import com.example.snakeladdersolution.models.Player;

public class GameController {
    public Game startGame() {
        Game game = new Game(10, 1);
        game.getPlayers().add(new Player("A"));
        game.getPlayers().add(new Player("B"));
        game.getPlayers().add(new Player("C"));
        return game;
    }

    public void playGame(Game game) {
        game.playGame();
    }
}
