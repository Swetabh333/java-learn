package oop;

class Car{
    private String type;
    private String model;
    private String color;
    private int speed;

    public Car(String type, String model, String color, int speed){
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    int increaseSpeed(int increment){
        this.speed += increment;
        return this.speed;
    }
}

public class learn {
    public static void main(String[] args) {
        Car focus = new Car("Ford", "Focus", "red",10);
        Car auris = new Car("Toyota", "Auris", "blue",10);
        Car golf = new Car("Volkswagen", "Golf", "green",10);

        focus.increaseSpeed(10);
        auris.increaseSpeed(20);
        golf.increaseSpeed(30);
        
    }
}
