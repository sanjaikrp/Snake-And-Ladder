package com.example.snakeladdersolution.services;

public class DiceService {
    public static int rollDice(int n) {
        int minimum = 1;
        int maximum = n * 6;
        return (int) Math.floor(Math.random() * (maximum - minimum  + 1) + minimum);
    }
}
