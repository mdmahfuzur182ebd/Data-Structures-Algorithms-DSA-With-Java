package LinearSearchAlgorithm;

import javax.swing.plaf.IconUIResource;

public class EvenDigits {
    public static void main(String[] args) {
       int[] numbs = {12,345,2,6,7896};
        System.out.println(findNumbers(numbs));
        System.out.println(digits2(435646));
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
    static  int digits2 (int num){
        if (num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num ){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10; //num/=10
        }
        return count;
    }
}
