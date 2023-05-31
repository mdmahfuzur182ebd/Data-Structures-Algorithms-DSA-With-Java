package FunctionJava;

public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b =44;
       // System.out.println(num);
        System.out.println(a);
        {
           // int a = 99; //already initialised outside the block in the same method, hence you can't initialise again
            a =33;  // reassign the origin ref variable to some other value
            //block scope
            System.out.println(a);
            int c = 99;
            //value initialised in this block, will remain in block
        }
       // System.out.println(c); //cnn not use outside the block
        System.out.println(a);
    }

    static void random(){
        int num = 33;
        int a= 390;
        System.out.println(num);
    }
}

