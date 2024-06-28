package vn.edu.likelion.bai1;

public abstract class Vehicle {
    protected final int id;
    protected String name;
    private static int vehicleCount;

    public Vehicle(int id, String name){
        this.id = id;
        this.name = name;
        vehicleCount++;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    abstract void move();
}
