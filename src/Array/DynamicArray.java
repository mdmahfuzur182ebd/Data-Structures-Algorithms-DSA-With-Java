package Array;

import java.util.ArrayList;
import java.util.Scanner;

//ArrayList
public class DynamicArray {
    public static void main(String[] args) {
        //syntax
       // ArrayList<Object> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(20);
//        list.add(44);
//        list.add(64);
//        list.add(74);
//        list.add(34);
//        list.add(24);
//        list.add(5656);
//        list.add(5656);
//        list.add(5656);
//        list.add(5656);
//        list.add(5656);

      //  System.out.println(list.contains(77)); //find number
//        System.out.println(list);
//        list.set(0, 398);
//        list.remove(3);
//        System.out.println(list);

        //input
        for (int i= 0; i<5; i++){
            list.add(in.nextInt());
        }
///
        //get item at any index
        for (int i = 0; i<5; i++){
            //get(INDEX)
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
       // System.out.println(list);

    }
}
