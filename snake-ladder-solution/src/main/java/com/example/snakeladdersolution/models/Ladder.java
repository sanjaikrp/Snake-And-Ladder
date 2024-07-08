package com.example.snakeladdersolution.models;

public class Ladder extends BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEntityType() {
        return "L(" + this.getEnd() + ")";
    }
}
