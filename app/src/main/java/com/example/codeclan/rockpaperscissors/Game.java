package com.example.codeclan.rockpaperscissors;

import java.util.HashMap;

/**
 * Created by user on 20/12/2017.
 */

public class Game {
    String playerChoice;
    String computerChoice;
    HashMap<String, String> winLookup;

    public Game(String inputPlayerChoice) {
        this.playerChoice = inputPlayerChoice;
        ComputerChoice newChoice = new ComputerChoice();
        this.computerChoice = newChoice.getChoice();
        this.winLookup = new HashMap<>();
        winLookup.put("Rock", "Scissors");
        winLookup.put("Scissors", "Paper");
        winLookup.put("Paper", "Rock");
    }


    public Boolean decideWin() {
       String value = winLookup.get(this.playerChoice);
       return value.equals(this.computerChoice);
    }

    public Boolean decideDraw() {
        return this.playerChoice.equals(this.computerChoice);
    }


    public String result() {
        if (decideWin()) return "Player wins by playing " + playerChoice + " and beating " + computerChoice;
        if (decideDraw())return "Draw, both played " + playerChoice;
        return "Computer wins by playing " + computerChoice + " and beating " + playerChoice;
    }


}
