package com.example.snakeladderstarter.models;

import java.util.HashMap;

public class Board {
    private HashMap<Integer, BoardEntity> cells;
    private final int cellCount;
    private final int min = 2;
    private int max;
    private int start;
    private int end;

    public Board(int dimension) {
        this.cellCount = dimension * dimension;
        cells = new HashMap<>();
        for (int i = 0; i < dimension; i++) {
            setSnake();
            setLadder();
        }
    }

    private void setSnake() {
        max = cellCount - 1;
        start = (int) Math.floor(Math.random() * (max - min + 1) + min);
        max = start - 1;
        end = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (!hasSnakeOrLadder(start)) {
            setEntity(start, new Snake(start, end));
        }
    }

    private void setLadder() {
        max = cellCount - 1;
        end = (int) Math.floor(Math.random() * (max - min + 1) + min);
        max = end - 1;
        start = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (!hasSnakeOrLadder(start)) {
            setEntity(start, new Ladder(start, end));
        }
    }

    private void setEntity(int index, BoardEntity boardEntity) {
        cells.put(index, boardEntity);
    }

    public BoardEntity getEntity(int index) {
        if (hasSnakeOrLadder(index)) {
            return this.cells.get(index);
        }
        return null;
    }

    public boolean hasSnakeOrLadder(int cellIndex) {
        return cells.containsKey(cellIndex);
    }

    public void printBoard() {
        for (int i = 1; i < cellCount - 1; i++) {
            System.out.print(i + " ");
            if (hasSnakeOrLadder(i)) {
                System.out.print(cells.get(i).getEntityType());
            } else {
                System.out.print("     ");
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public void setCells(HashMap<Integer, BoardEntity> cells) {
        this.cells = cells;
    }
}
