package FunctionJava;

public class Swap {
    public static void main(String[] args) {
        int a = 29;
        int b = 23;
        //Swap numbers code
//        int temp = a;
//        a = b;
//        b= temp;
//        System.out.println(a+ " " +b);
        swap(a,b);
        System.out.println(a+ " "+ b);
    }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b= temp;
       // System.out.println(a+ " "+ b);
    }
    //primitive pass a value....
}
