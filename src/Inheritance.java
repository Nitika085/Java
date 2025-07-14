class Vehicle {
    String color;
    int tyres;

    public Vehicle(String color, int tyres) {
        this.color = color;
        this.tyres = tyres;
    }

    public void blowHorn() {
        System.out.println("Blowing horn: Beep Beep!");
    }

    public void showColor() {
        System.out.println("Color: " + color);
    }

    public void showTyres() {
        System.out.println("Number of tyres: " + tyres);
    }
}

class Car extends Vehicle {
    String brand;

    public Car(String brand, String color, int tyres) {
        super(color, tyres); // call Vehicle constructor
        this.brand = brand;
    }

    public void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Red", 4);
        c.showBrand();     // from Car
        c.showColor();     // inherited from Vehicle
        c.showTyres();     // inherited from Vehicle
        c.blowHorn();      // inherited from Vehicle
    }
}
