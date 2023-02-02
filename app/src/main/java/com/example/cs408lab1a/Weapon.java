package com.example.cs408lab1a;

public enum Weapon {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String messages;

    private Weapon(String msg) { messages = msg;}

    @Override
    public String toString() {return messages; }
}
