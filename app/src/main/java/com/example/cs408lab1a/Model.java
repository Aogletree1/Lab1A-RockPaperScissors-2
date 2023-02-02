package com.example.cs408lab1a;

public class Model {
    private int counter;

    public Model() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter += 1;
    }

    public void decrement() {
        counter -= 1;
    }

}
