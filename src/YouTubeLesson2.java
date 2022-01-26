public class YouTubeLesson2 {



    // ******** In this lesson we will learn about the Data Types in Java  ***********


    /*
        In Java there are many Data Types we use. Here in this lesson, we will talk about the most commonly used data types in the real-life.
         String  is one of the most important and well known sequence characters in java, which will be used to identify the variable.
         If you are using String Identifiers at the time of defining the variables then; Java will know what’s coming.
         E.g: Now let's see the demo on how to utilize the String in programming.
     */

    public static void main(String[] args) {

        // Another simple but important to know is data Types has its own key-words which are used to identify themselves

        String words = "Kash_Kal";       // Here we just used String keywords, which will let the program know what kind of variable can be expected

        int number = 9;                 // Here we just used the integer, this has the space to hold up-to 4 bytes and only Whole numbers

        float decimalValue =  0.11f;    // Here we used float to store the decimal values; it holds up-to 4 bytes

        long largeNumber = 1234567891l;  // We used Long to store larger data just after integers it holds up to 8 bytes

        double verylargeNumber = 0123456.1234d;  // double is used to store the large number of fractional data.  8 bytes

        char storeCharacters = '$';             // This char keywords holds the characters. storage size is limited 2 bytes.

        boolean firstAnswer = true;
        boolean secondAnswer = false;           // This is the boolean data type also widely used in java. can only give true or false

        System.out.println(" Let's see if the given number is equals to 10 or not :");
        if( number == 10){
            System.out.println(firstAnswer);
        }else
            System.out.println(secondAnswer);






         /*  This is about the Operators in java
         *
         * Operators could be logical and arithmetical operators */

        // Arithmetical Operators are those symbols used for mathematical operation

        int testSum = number + 10;               // This (+) gives you the addition of given numbers.
        System.out.println(number);

        int subtractnum = number - 10;          // This (-) gives you the subtraction of given numbers. It can also be long, double or float depends on as per requirements
        System.out.println(subtractnum);

        float   decimalResult = number / 2.2f;  // This (/) will give you the dividend values only not the reminders or the fraction
        System.out.println(decimalResult);

        long multiplicationResult = number * number;  // This (*) will give the result of multiplication,
        // and we used long keyword to make sure if the multiplication is larger number we can still hold the values.
        System.out.println(multiplicationResult);

        int reminderValue = number % 2;             // This (%) will give you the reminder value after you divide; in our case it will be 4
        System.out.println(reminderValue);

        // Now another two most useful and frequently used operators are ( ++ ) increment and ( -- ) decrement.
        // Will show you the use of this


        // The value of number is 9 till now.
        number --;                          // Here we just did Decrement by one; Coz at one time it will decrease value by 1
        System.out.println(number);




    }
}
