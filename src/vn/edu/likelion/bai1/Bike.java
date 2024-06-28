package vn.edu.likelion.bai1;

public class Bike extends Vehicle{

    private boolean hasGear;

    public Bike(int id, String name, boolean hasGear) {
        super(id, name);
        this.hasGear = hasGear;
    }

    @Override
    void move() {
        System.out.println("Bike is moving");
    }
}
