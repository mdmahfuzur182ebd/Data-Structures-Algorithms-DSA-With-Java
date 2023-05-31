package Conditionals;
//Switch statement and Nested case in java

import javax.management.MBeanRegistration;
import java.util.Objects;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
//        if (fruit.equals("mango")){
//
//        }
//        String a= "some";
//        String b = "some";
//        System.out.println(a==b);
        if (fruit.equals("mango")){
            System.out.println("King of fruit");
        }
         if (fruit.equals("apple")){
                System.out.println("a sweet red fruit");
            }


    }
}

/*
In switch statements, you can jump to various cases based on your expression
syntax:
  switch(expression){
        case
        case one:
            //do something
            break;
         case two:
            //do something
            break;
         default:
               //do something
      }

     NOTE:
      - cases have to be the same type as expressions, must be a constant or literal
      - duplicate case value are not allow.
      -break is used to terminate the sequence.
      -if break is not used it will continue to next case.
      -default will execute when more of the above does.
      - if default is not at the end , put break after it
*/

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String fruit = in.next();
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case  "Grapes":
//                System.out.println("Small Fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid  Fruit ");
//        }
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
}

class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID){
            case 1:
                System.out.println("Some Someday");
                break;
            case 2:
                System.out.println("Some Thing Do");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entry");
                 }
                 break;
            default:
                System.out.println("Enter correct EmpID");
              }
    }
}