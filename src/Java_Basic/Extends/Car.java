package Java_Basic.Extends;

public class Car {
    String color;
    Integer speed;

    Car(String color){
        this.color = color;
        speed = 0;
    }

    void accelerate() {
        this.speed += speed;
    }

    void decelerate() {

        speed -= 10;
    }

    void fullAccelerate(){
        Integer speed = 1;
        for(; speed <10; speed++){
            this.speed += speed;
        }

        System.out.println(speed);
    }

    public void displayInfo() {
        System.out.println("Car Color: " + color );
    }
}