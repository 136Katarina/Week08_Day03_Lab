package com.example.codeclan.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 20/12/2017.
 */

public class ComputerChoice {
    String choice;

    public ComputerChoice() {
        this.choice = randomChoice();
    }
    
    public String randomChoice() {
        ArrayList<String> choices = new ArrayList<>(Arrays.asList("Rock", "Paper", "Scissors"));
        Collections.shuffle(choices);
        return choices.get(0);
    }

    public String getChoice() {
        return choice;
    }
}
