package org.example.inheritanceexamples;

public class RoadVehicle extends Vehicle{

    @Override
    void start() {
        IO.println("Road Vehicle is starting");
    }

    @Override
    void stop() {
        IO.println("Road Vehicle is stopping");
    }

    @Override
    void fuel() {
        IO.println("Road Vehicle ic fueling");
    }

    public void travelOnRoad() {
        IO.println("These vehicles travel`s on Road");
    }

}
