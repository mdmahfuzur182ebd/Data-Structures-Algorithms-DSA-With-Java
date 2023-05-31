package FunctionJava;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,3,3,45,23};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0] = 43; //if you make a change to the object via this ref variable. same object will be change


    }
}
