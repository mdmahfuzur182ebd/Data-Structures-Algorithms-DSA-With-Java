package FunctionJava;

public class PassingExample {
    public static void main(String[] args) {
        String name = "MRahman";
        myName(name);
        System.out.println(name);

    }


    static void myName(String naam) {
      // System.out.println(naam);
        naam = "some";//creating a new object
    }
}
