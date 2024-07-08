package com.example.snakeladdersolution.game;

import com.example.snakeladdersolution.models.Board;
import com.example.snakeladdersolution.models.Player;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    private Board board;
    private Queue<Player> players;
    private int diceCount;
    private int dimension;
    private int boardSize;

    public Game(int dimension, int diceCount) {
        this.boardSize = dimension * dimension;
        this.dimension = dimension;
        this.diceCount = diceCount;
        this.board = new Board(dimension);
        this.players = new LinkedList<>();
    }

    public void playGame() {
        this.board.printBoard();
        while (players.size() > 1) {
            Player currentPlayer = players.poll();
            System.out.println();
            System.out.println(currentPlayer.getUserName() + "'s turn.");
            System.out.println("Press 'r' to roll the dice");

            Scanner scanner  = new Scanner(System.in);
            char c = scanner.next().charAt(0);
            currentPlayer.makeMove(this);

            if (currentPlayer.getPosition() == boardSize) {
                System.out.println(currentPlayer.getUserName() + " won !!");
            } else {
                players.add(currentPlayer);
            }

            printPlayerPositions();
        }
    }

    private void printPlayerPositions() {
        for (Player player : players) {
            System.out.println(player.getUserName() + ": " + player.getPosition());
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Queue<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Queue<Player> players) {
        this.players = players;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }
}
