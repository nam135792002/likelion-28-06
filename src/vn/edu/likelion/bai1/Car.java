package vn.edu.likelion.bai1;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(int id, String name, int numberOfDoors) {
        super(id, name);
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    void move() {
        System.out.println("Car is moving");
    }
}
