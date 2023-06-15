package LinearSearchAlgorithm;

import javax.swing.plaf.IconUIResource;

public class EvenDigits {
    public static void main(String[] args) {
       int[] numbs = {12,345,2,6,7896};
        System.out.println(findNumbers(numbs));
    }

    static  int findNumbers(int[] numbs){
        int count = 0;
        for(int num : numbs){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
   static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
        /*if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;*/
   }

    // count number of digits in a number
    static int digits(int num ){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10; //num/=10
        }
        return count;
    }
}
