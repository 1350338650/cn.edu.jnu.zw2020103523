package com.example.cnedujnuzw2020103523;

public class Game {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }


}
