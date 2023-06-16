package ProblemSolved;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(252));
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
