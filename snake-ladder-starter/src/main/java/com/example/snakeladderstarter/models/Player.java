package com.example.snakeladderstarter.models;

import com.example.snakeladderstarter.game.Game;
import com.example.snakeladderstarter.services.DiceService;

public class Player {
    private int position;
    private String userName;

    public Player(String userName) {
        position = 0;
        this.userName = userName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void makeMove(Game game) {
        int currentPosition = this.getPosition();
        int move = DiceService.rollDice(game.getDiceCount());

        System.out.println("You've got " + move);
        int finalPosition = currentPosition + move;
        if (finalPosition <= game.getBoardSize()) {
            if (game.getBoard().hasSnakeOrLadder(finalPosition)) {
                System.out.println(game.getBoard().getEntity(finalPosition).getEntityType());
                finalPosition = game.getBoard().getEntity(finalPosition).getEnd();
            }
        } else {
            System.out.println("Try again in the next turn.");
            finalPosition = currentPosition;
        }

        this.setPosition(finalPosition);
    }
}
