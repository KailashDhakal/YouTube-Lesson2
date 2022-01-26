public class College {

    public static void main(String[] args) {

        // To use the Employee Class we created we required
        // To create the object to assign the value

        Employee student = new Employee();          // This is how we create the object of the class and pass the value
        student.EmployeeType = "Student Worker";
        student.EmployeeName = "Kailash Dhakal";
        student.EmployeeAddress = "Louisiana";
        student.EmployeeWorkDepartment = "Medical Library";
        student.salary = 2000;


        System.out.println( "This is checking either our value has been pass with the help of object or not : "
                + student.EmployeeType + " " + "This is : " +student.EmployeeName);


        // The way to calculate the Monthly salary
//        long monthlySalary = student.salary / 12;
//        System.out.println(student.EmployeeName +"  This is what I make a Month  : "+  monthlySalary + "  being a  " + student.EmployeeType);

        // We are printing this from new method we created monthlySalary
//        student.monthlySalary();
        System.out.println("This is what " + student.EmployeeName + "  Make every Month : $ " + student.monthlyPay());

        // This is using the new method we created saying monthSlary where we will pass the parameter and get the value in return

        System.out.println("\n This is : " + student.EmployeeName + " I earn $ 1500 a Month, So Weekly I make : $" + student.weeklyPay(1500));







        Employee fullTime = new Employee();         // This is again creating the different object to demonst that same class can be use multiple way
        fullTime.EmployeeType = "Full Time";
        fullTime.EmployeeName = "Ramesh Pandey";
        fullTime.EmployeeAddress = "Dallas";
        fullTime.EmployeeWorkDepartment = "Networking";
        fullTime.salary = 75000;

        System.out.println("\n This is again the testing for fulltime object we created : \n " + " I am : " + fullTime.EmployeeName + " & I am a  " + fullTime.EmployeeType );
        fullTime.monthlySalary();

        System.out.println("This is what " + fullTime.EmployeeName + "  Make every Month : $ " + fullTime.monthlyPay());
    }
}

// Create the class template which entity can be reused
class Employee {
    String EmployeeType;                        //Either full time or the student worker
    String EmployeeName;
    String EmployeeAddress;
    String EmployeeWorkDepartment;
    long salary;                                // Yearly based


    // To reduce the redundant code we will create the method so that we can use the same method to calculate for the given employee

    // first method we will create is going to be void method
    // This Void method will not return anything, but we will ask this method to print the result for us
    void monthlySalary(){
        double monthlyPay = salary / 12;
        System.out.println( " \n This is the monthly salary : " + monthlyPay );
    }

    // This is the Method which will return the value to the object, and we can print
    double monthlyPay(){
        return  salary / 12;
    }

    //We will create the new method which will take an argument and process it and return the value
    double weeklyPay(long salary){
        return salary / 4;                       // Consider there are 4 weeks in a month
    }
}
