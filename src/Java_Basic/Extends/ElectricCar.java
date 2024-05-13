package Java_Basic.Extends;

public class ElectricCar extends Car {
    private int batteryCapacity;
    public ElectricCar(String color,int batteryCapacity) {
        super(color); this.batteryCapacity = batteryCapacity;
    }
    @Override public void displayInfo() {
    super.displayInfo();
    System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
