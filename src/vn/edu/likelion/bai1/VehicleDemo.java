package vn.edu.likelion.bai1;

import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        ArrayList<Vehicle> listVehicle = new ArrayList<>();
        listVehicle.add(new Car(111, "Vinfast", 4));
        listVehicle.add(new Car(112, "Lamboghini", 6));
        listVehicle.add(new Bike(113, "Green", true));
        listVehicle.add(new Bike(114, "Red", false));

        for(Vehicle vehicle : listVehicle){
            vehicle.move();
        }

        System.out.println("Total of vehicle: " + Vehicle.getVehicleCount());
    }
}
