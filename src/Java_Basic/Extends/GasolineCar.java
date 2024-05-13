package Java_Basic.Extends;

public class GasolineCar extends Car {
    private int fuelCapacity;
    public GasolineCar(String color, int fuelCapacity) {
        super(color); this.fuelCapacity = fuelCapacity;
    }
    @Override public void displayInfo() {
    super.displayInfo();
    System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}
