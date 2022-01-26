public class Lesson6 {


    public static void main(String[] args) {

        // To use the Vehicle class we have to create an object
        Vehicle vehicle = new Vehicle(); // We created an object of vechicle
        vehicle.VehicleType = "car";
        vehicle.color = "Red";
        vehicle.fuelBurn = 25;
        vehicle.maxSpeed = 260;
        vehicle.tankCapacity = 37;
        vehicle.fuelEndurance();


        // We create the aircraft object using the Vehicle class
        Vehicle aircraft = new Vehicle() ;
        aircraft.VehicleType = "plane";
        aircraft.fuelBurn = 55;
        aircraft.color = "white";
        aircraft.maxSpeed = 550;
        aircraft.tankCapacity = 1000;
        aircraft.fuelEndurance();


        System.out.println("This is from the vehicle class: " + vehicle.VehicleType);
        System.out.println("This is from the aircraft class: " + aircraft.VehicleType);


        // find out the fuelEndurance  of the Vehicle "car"
//       double fuelEndurance = (vehicle.tankCapacity / vehicle.fuelBurn);
//        System.out.println("\nThe fuel Endurance of Vehicle Car is : " + fuelEndurance);


//        double aircraftFuelEndurance = (aircraft.tankCapacity/ aircraft.fuelBurn);
//        System.out.println("This is the calculation of the Aircraft Fuel Endurance : " + aircraftFuelEndurance);
    }

}
class Vehicle{
    String VehicleType;
    String color;
    long maxSpeed;
    double fuelBurn;
    int tankCapacity;

    // We will create the method to calculate the Fuel Endurance for whatever object we create

    void fuelEndurance(){

        double answer = (tankCapacity / fuelBurn);
        System.out.println("This is done using the new method FuelEndurance : " + answer);
    }
}
