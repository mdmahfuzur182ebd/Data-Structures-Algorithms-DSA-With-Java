package Array;

public class Main {
    public static void main(String[] args) {
        //Q: store a roll number
        int a = 19;

        //Q: store a person"s name
        String name = "something";

        //Q: store 5 roll numbers
        int ro1 = 33;
        int ro2 = 44;
        int ro3 =42;

        //Syntax
        // datatype[] variable_name = new datatype[size];
        int[] roll_number = new int[5];
        //or directly
        int[] roll = {23,344,21,445,12};

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation actually here object is being created in the memory(heap)
      //  System.out.println(ros[0]);//0 default

         //String array
        String[] arr = new String[4];
        //System.out.println(arr[0]); //null

        // what is null in java
        //String str = null;
        //null is used as a default

    }
}
