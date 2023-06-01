package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] num = {23,44,11,12,34};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change (int[] arr){
        arr[0] = 99;
    }
}
