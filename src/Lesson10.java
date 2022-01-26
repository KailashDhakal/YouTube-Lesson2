import java.awt.*;

public class Lesson10 {

    public static void main(String[] args) {
        Car sportsCar = new Car("Dodge", "Challenger", 2020,"Yellow");  // This is an object creation
        Car economyCar = new Car("Toyota", "Avalon", 2021,"Silver");

        System.out.println("This is the :" + sportsCar.getMake() + " and Model is :" +sportsCar.getModel() + " year : " + sportsCar.getYear());
        System.out.println("This is the : " + economyCar.getMake() + " and Model is :" + economyCar.getModel() + " year " + economyCar.getYear());


        System.out.println("Print either the make of sports and economy car is same or not : " +sportsCar.getMake().equals(economyCar.getMake()));
    }
}
class  Car{
     private String make;
     String model;
     int year;
     String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
