// method overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different. It is related to compile-time (or static) polymorphism.
public class method {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        method obj = new method();
        System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
        System.out.println("Sum of 3 numbers: " + obj.add(10, 20, 30));

        //or
         int r1 = obj.add(10, 20);
         int r2 = obj.add(10, 20, 30);
         System.out.println(r2 + " " + r1);
    }
}
