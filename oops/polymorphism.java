// polymorphism is a concept in java which allows us to perform a single action in different ways.
// many behaviors
//--runtime polymorphism -- this is also called dynamic polymorphism. It is achieved by method overriding.
//--compile time polymorphism -- this is also called static polymorphism. It is achieved by method overloading.


public class polymorphism {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        polymorphism obj = new polymorphism();
        System.out.println("Sum of 2 numbers: " + obj.add(5, 10));
        System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15));
        //so here we have 2 methods with same name but different parameters. This is called method overloading.
        //and this is compile time polymorphism because the method to be called is determined at compile time.
        //runtime polymorphism is achieved by method overriding. It is achieved by creating a subclass that overrides a method in the superclass. The method to be called is determined at runtime based on the object type.
    }
    
}
