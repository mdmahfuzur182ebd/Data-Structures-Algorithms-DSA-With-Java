package Conditionals;

//given a number and reverse n =23597 --79532
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(ReversNumber(4532));

    }

     static int ReversNumber(int num){
         int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
         }
        return ans;
     }

    static boolean isPalindrome(int x) {
        int num = x;

        if (x < 0) {
            return false;
        } else {
            int rev = 0;
            while (x != 0) {
                int rem = x % 10;
                rev = rev * 10 + rem;
                x = x / 10;
            }
            return num == rev;
        }
    }
}

