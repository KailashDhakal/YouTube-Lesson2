public class Lesson7 {

    public static void main(String[] args) {

        // To use the Vehicle class we have to create an object
        Vehicl vehicle = new Vehicl(); // We created an object of vehicle
        vehicle.VehicleType = "car";
        vehicle.color = "Red";
        vehicle.fuelBurn = 25;
        vehicle.maxSpeed = 260;
        vehicle.tankCapacity = 37;
        vehicle.fuelEndurance();


        // We create the aircraft object using the Vehicle class
        Vehicl aircraft = new Vehicl() ;
        aircraft.VehicleType = "plane";
        aircraft.fuelBurn = 55;
        aircraft.color = "white";
        aircraft.maxSpeed = 550;
        aircraft.tankCapacity = 1000;
        double fuelRequired = aircraft.requiredFuel(10);



        System.out.println("This is Lesson7 \n");

        System.out.println("This is from the vehicle class: " + vehicle.VehicleType);
        System.out.println("This is from the aircraft class: " + aircraft.VehicleType);


        System.out.println("\n This is the Endurance been return from the New return method fuelEndurance : " + aircraft.fuelEndurance());
        System.out.println("\n This is the Endurance been return from the New return method fuelEndurance : " + vehicle.fuelEndurance());

        System.out.println("\n This is the value coming from  the new method we created requiredFuel : " + vehicle.requiredFuel(7) + " this gallons of fuel is required to fly" );

        System.out.println("\n This is the value coming from  the new method we created requiredFuel : " + fuelRequired + " this gallons of fuel is required to fly" );


        // find out the fuelEndurance  of the Vehicle "car"
//       double fuelEndurance = (vehicle.tankCapacity / vehicle.fuelBurn);
//        System.out.println("\nThe fuel Endurance of Vehicle Car is : " + fuelEndurance);


//        double aircraftFuelEndurance = (aircraft.tankCapacity/ aircraft.fuelBurn);
//        System.out.println("This is the calculation of the Aircraft Fuel Endurance : " + aircraftFuelEndurance);
    }

}
class Vehicl{
    String VehicleType;
    String color;
    long maxSpeed;
    double fuelBurn;
    int tankCapacity;

    // We will create the method to calculate the Fuel Endurance for whatever object we create

//    void fuelEndurance(){
//
//        double answer = (tankCapacity / fuelBurn);
//        System.out.println("This is done using the new method FuelEndurance : " + answer);
//    }

    // On This Lesson We will create the Method which will return the double value

    double fuelEndurance(){
        double answer = (tankCapacity / fuelBurn);
        return answer;
    }


    // Now this new method will take the one argument and process it then will return the double value
    double requiredFuel(double time){
        return (tankCapacity * fuelBurn);
    }
}

