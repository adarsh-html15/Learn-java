public class variable {
    static int a = 10; // static variable meaning it belongs to the class and can be accessed without
                       // creating an instance of the class

}

public static void main(String args[]) {
    int a = 10;
    double d = (double) a; // type casting  
    int b = 20;
    int c = a + b;
    System.out.println("The sum of a and b is: " + c);
    System.out.println("The value of d is: " + d);
}
