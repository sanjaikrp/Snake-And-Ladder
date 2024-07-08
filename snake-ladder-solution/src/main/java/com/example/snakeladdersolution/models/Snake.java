package com.example.snakeladdersolution.models;

public class Snake extends BoardEntity {
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEntityType() {
        return "S(" + this.getEnd() + ")";
    }
}
