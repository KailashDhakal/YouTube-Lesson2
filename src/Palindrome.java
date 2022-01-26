import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {


        // Palindrome means the word that has no difference either from the front or back
        // Example of palindromes are "MADAM" == ""MADAM" ; "DAD" ==> "DAD"

        // The Logic behind it is either from the reverse the word should be similar.

        // step One: Give the word or ask from the user
        String  takenWord = "Madam";
        String givenWord = takenWord.toUpperCase(Locale.ROOT);

        // Now we need to compare the word from the reverse side
        // For this we have to come the first index with the last index of the givenWord

        int front = 0;
        int reverse = givenWord.length() -1;      // This means the last index of the givenWord because .length will start from 1 but in index we count from 0

        // Now it's time to compare using the loop coz we have to compare all letters one by one
        while (front < reverse){
            if(givenWord.charAt(front) == givenWord.charAt(reverse)){
                System.out.println("It's palindrome \n" + givenWord);
            }else
            System.out.println("No ");

            front ++;
            reverse --;
            break;
        }



    }

}
