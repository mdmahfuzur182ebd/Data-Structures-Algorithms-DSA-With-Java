package FunctionJava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//       int ans = greeting(34,55);
//        System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = in .nextLine();
        String person = myGreet(name);
        System.out.println(person);
    }
    // Pass the value of numbers when you are calling the method in amina()

    static int greeting(int a , int b){
      int sum = a+b;
      return sum;
    }

    static String myGreet(String name){
        String message = "Hello " +name;
        return message;
    }
}
