import java.util.Scanner;

public class MyMain {

    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int numberofA = 0;
        int numberofB = 0;
        int numberofC = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                numberofA++;
            } else if (str.charAt(i) == 'b') {
                numberofB++;
            } else if (str.charAt(i) == 'c') {
                numberofC++;
            }
        }

        return numberofA + numberofB + numberofC;
    }


    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {

        int x = (str.indexOf("the"));
        int y = (str.indexOf("The"));
        if (x < 0 && y<0) {
            return false;
        } else{ return true;}



    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                return true;
            } else {
                return false;
            }
        }

        return true;

}




        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);

            System.out.println(countABC("asdfghjkl"));
            System.out.println(containsThe("the athenian school"));
            System.out.println(isPalindrome("tacocat"));

        }

    }


