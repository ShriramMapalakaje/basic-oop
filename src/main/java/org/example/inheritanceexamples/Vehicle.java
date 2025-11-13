package org.example.inheritanceexamples;

public class Vehicle {

    public String color = "unknown";

    void start() {
        IO.println("START");
    }

    void stop() {
        IO.println("STOP");
    }

    void fuel() {
        IO.println("Adding fuel");
    }
}
