package com.example.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 20/12/2017.
 */

public class ComputerChoiceTest {
    ComputerChoice testComputerChoice;

    @Before
    public void before() {
        testComputerChoice = new ComputerChoice();
    }

    @Test
    public void canRandomiseChoice() {
        assertNotNull(testComputerChoice.getChoice());
    }

}
