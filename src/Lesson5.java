import com.sun.tools.javac.Main;

public class Lesson5 {

// We can call the static method without creating an object; from the main method
    static  void myFirstApp(){
        System.out.println("\n This is from my FirstApp method");
    }
    // Public method
    public void myPublicMethod() {
        System.out.println("\n Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {

        // call myfirstApp and get the print
        myFirstApp();

        // to print from the myPublicMethod we need to create an object
        // create an object first

        Lesson5 lesson = new Lesson5();

        // now we need to pass the arguments to the lesson object

        lesson.myPublicMethod(); // Now this should print from the myPublicMethod

    }



}
