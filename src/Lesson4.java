public class Lesson4 {


    // This lesson is more Focus in Array in java

    public static void main(String[] args) {

        int[] myIntArray = {2,3,4,5};


        System.out.println("This is Printing using the For Loop ");
    // This is to print all the array values using for loop
        for(int i = 0; i < myIntArray.length; i++){

            int finalResult = myIntArray[i];
            System.out.println("\n : " + finalResult);
        }

        // If you already know the index (position ) of the value we can directly get access to it and ask to print
        System.out.printf(" This is Printing directly after index is given");
        System.out.println( " : \n" + myIntArray[2]);                  // This will print the value of index 2 which must be 4


        // can also do the same print or basically same thing using the While Loop
        // First initialization of the variable e.g: int a = 0;

        System.out.println("This is print using the While Loop");
        int a=0;
        while (a < myIntArray.length){
            System.out.println(" \n : " +myIntArray[a]);
            a ++;
        }


        System.out.println( myIntArray);   // This is run time error where you will not get any reasonable results

        // Therefore, you have to pass the value and request to print or utilize the value one by one (simple)

        // Can use foreach loop, this is easy and my favorite

        System.out.println("This is being print using the foreach loop");
        for (int answer : myIntArray){
            System.out.println(" : \n " + answer);
        }

        System.out.println("The length of the array is : " + myIntArray.length );   // This is to find the length of the array


    }
}

