package org.example.inheritanceexamples;

public class WaterVehicle extends Vehicle{
    @Override
    void start() {
        IO.println("Water Vehicle is starting");
    }

    @Override
    void stop() {
        IO.println("Water Vehicle is stopping");
    }

    @Override
    void fuel() {
        IO.println("Water Vehicle ic fueling");
    }
    public void travelOnWater() {
        IO.println("These vehicles travel`s on Road");
    }
}
