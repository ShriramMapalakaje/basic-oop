package org.example.inheritanceexamples;

public class MainInheritanceClass {
    void main() {
        IO.println("--------------Vehicle Parent Class--------------");
        Vehicle v = new Vehicle();
        v.start();
        v.stop();
        v.fuel();

        IO.println("--------------Water Vehicle Class--------------");
        WaterVehicle wv = new WaterVehicle();
        wv.start();
        wv.stop();
        wv.fuel();
        wv.travelOnWater();


        IO.println("--------------Road Vehicle Class--------------");
        RoadVehicle rv = new RoadVehicle();
        rv.start();
        rv.stop();
        rv.fuel();
        rv.travelOnRoad();



        IO.println("--------------Air Vehicle Class--------------");
        AirVehicle av = new AirVehicle();
        av.start();
        av.stop();
        av.fuel();
        av.travelOnAir();
    }
}
