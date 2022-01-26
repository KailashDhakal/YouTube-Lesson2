public class Lesson9 {

    public static void main(String[] args) {
        Student.numbersOfStudents = 1;
        Student fullStudent = new Student("FullTime ", "Kash_KAL " ,
                "Shreveport ", " Computer Science", 2500.00);




        System.out.println("This is " + fullStudent.StudentType + " Student " + fullStudent.StudentName + " I am making $ "
                +fullStudent.salary + " a Month" + "& Number of student is : " + Student.numbersOfStudents );


        // This is another object we created out of the Student Class and pass the value
        Student partTimeStudnet = new Student("Part Time", " Kashi Ram", "Dallas", "MBA", 4000.50);

        System.out.println("This is the Part Time student " + partTimeStudnet.StudentName + " I make $" + partTimeStudnet.salary + " a Month");

        

    }
}

// Create the class of Employee where we define the attributes
class Student {
    String StudentType;                        //Either full time or the student worker
    String StudentName;
    String StudentAddress;
    String StudentDepartment;
    double salary;                                // Yearly based
    static int numbersOfStudents;


    // Creating constructor will help to reduce the lines of code and give fine look
    Student(String typeOfStudent, String NameOfStudent, String AddressOfStudent, String DepartmentMajor, double SalaryOfWorkingStudent){
        this.StudentType = typeOfStudent;
        this.StudentName  = NameOfStudent;
        this.StudentAddress = AddressOfStudent;
        this.StudentDepartment = DepartmentMajor;
        this.salary = SalaryOfWorkingStudent;

    }

    // We will get the getters and setters which will definitely help us to control the value we will pass to the attributes.

    // Setter Method should be outside the constructor by itself
    // Again Setters will be for each individual attributes or variables we define inside the Student Class


    void setStudentType(String StudentType){      // Whatever variable we define here don't necessarily require matching to the class

        // Now here the proper use of setters is, we can actually control over the value we're going to pass to these variables.
        // In Our case student can Only be either part-time or full time student so
        if(StudentType.equals("Full Time") || StudentType.equals("Part Time")){
            this.StudentType = StudentType;             // Coz here we say hey java this. "" whatever we give = this Variables.
        }else   {
            StudentType.equals("Not Provided");
        }



    }
}
