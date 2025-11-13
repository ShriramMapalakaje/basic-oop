package org.example.inheritanceexamples;

public class AirVehicle extends Vehicle{



    @Override
    void start() {
        IO.println("Air Vehicle is starting");
    }

    @Override
    void stop() {
        IO.println("Air Vehicle is stopping");
    }

    @Override
    void fuel() {
        IO.println("Air Vehicle ic fueling");
    }



    public void travelOnAir() {
        super.color = "green";
        IO.println("These vehicles travel`s on Air");
    }
}
