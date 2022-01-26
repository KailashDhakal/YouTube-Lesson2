public class Lesson8 {


    // In this lesson we will learn about the constructor

    public static void main(String[] args) {


         /*Instead of creating and object and assigning the value to each variable we can directly use the constructor
        and then pass the parameters in the single line of code
        So We can comment out the below object and try the new */

        // To use the Vehicle class we have to create an object
//        Vehicl vehicle = new Vehicl(); // We created an object of vehicle
//        vehicle.VehicleType = "car";
//        vehicle.color = "Red";
//        vehicle.fuelBurn = 25;
//        vehicle.maxSpeed = 260;
//        vehicle.tankCapacity = 37;
//        vehicle.fuelEndurance();


        // We create the aircraft object using the Vehicle class
//        Vehicl aircraft = new Vehicl() ;
//        aircraft.VehicleType = "plane";
//        aircraft.fuelBurn = 55;
//        aircraft.color = "white";
//        aircraft.maxSpeed = 550;
//        aircraft.tankCapacity = 1000;
//        double fuelRequired = aircraft.requiredFuel(10);


        // passing the parameters or Value to the Constructor we created

        Vehicles car = new Vehicles("Car", "Yellow" , 310, 1.2, 35);


        System.out.println("This is Lesson8 \n");

//        System.out.println("\n This is the calculation done using the constructor : " +car.fuelEndurance());
//
          System.out.println("This will print the required fuel to fly for 7 hours : " +car.requiredFuel(7));

          System.out.println("This is from the vehicle class: " + car.VehicleType);
//        System.out.println("This is from the aircraft class: " + aircraft.VehicleType);


    }
}

    class Vehicles {
        String VehicleType;
        String color;
        long maxSpeed;
        double fuelBurn;
        int tankCapacity;

        // This time we will create the constructor of the vehicles class

        Vehicles(String VehicleType, String color, long maxSpeed, double fuelBurn, int tankCapacity){
            this.VehicleType = VehicleType;  // We have to specify to assign the variable saying this.
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.fuelBurn = fuelBurn;
            this.tankCapacity = tankCapacity;
        }

        // We will create the method to calculate the Fuel Endurance for whatever object we create

//    void fuelEndurance(){
//
//        double answer = (tankCapacity / fuelBurn);
//        System.out.println("This is done using the new method FuelEndurance : " + answer);
//    }

        // On This Lesson We will create the Method which will return the double value

        double fuelEndurance() {
            double answer = (tankCapacity / fuelBurn);
            return answer;
        }


        // Now this new method will take the one argument and process it then will return the double value
        double requiredFuel(double time) {
            return this.tankCapacity * this.fuelBurn;
        }
    }
