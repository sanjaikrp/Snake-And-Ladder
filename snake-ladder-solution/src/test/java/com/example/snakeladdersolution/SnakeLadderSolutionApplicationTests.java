package com.example.snakeladdersolution;

import com.example.snakeladdersolution.game.Game;
import com.example.snakeladdersolution.models.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SnakeLadderSolutionApplicationTests {
    private Game game;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    public void initializeGame() {
        game = new Game(10, 1);
        game.getPlayers().add(new Player("A"));
        game.getPlayers().add(new Player("B"));
        game.getPlayers().add(new Player("C"));
        game.getPlayers().add(new Player("D"));
    }

    @Test
    public void testSnakeAndLadder1() {

    }
}
