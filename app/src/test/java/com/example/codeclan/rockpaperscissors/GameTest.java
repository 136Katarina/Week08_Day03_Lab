package com.example.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/12/2017.
 */

public class GameTest {

    Game testGame;

    @Before
    public void before() {
        testGame = new Game("Rock");
    }

    @Test
    public void testWin() {
        testGame.computerChoice = "Scissors";
        assertEquals(true, testGame.decideWin());
        assertEquals(false, testGame.decideDraw());
        assertEquals(false, testGame.decideLost());
    }

    @Test
    public void testDraw(){
        testGame.computerChoice = "Rock";
        assertEquals(true, testGame.decideDraw());
        assertEquals(false, testGame.decideWin());
        assertEquals(false, testGame.decideLost());
    }

    @Test
    public void testLost(){
        testGame.computerChoice = "Paper";
        assertEquals(true,testGame.decideLost());
        assertEquals(false,testGame.decideDraw());
        assertEquals(false,testGame.decideWin());
    }
}
