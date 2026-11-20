//  constructor is a special type of method which is used to initialize the object of class 
//  constructor name is same as class name and it does not have any return type 

public class constructor {
   public constructor() {
      System.out.println("this is constructor which run auto when creat a obj");
   }

   public constructor(int a, int b) { // parameterised constructor
      int sum = a + b;
      System.out.println("Constructor with 2 parameters" + a + " " + b + " Sum: " + sum);
   }

   public String getmeback(int cost) {
      if (cost < 100)
         return "Cost is less than 100";
      else
         return "Cost is not less than 100";
   }

   public static void main(String args[]) {
      System.out.println("Hello World");
      constructor obj1 = new constructor();
      constructor obj = new constructor(10, 20);
      System.out.println("Constructor with 2 parameters" + obj);
      System.out.println(obj.getmeback(50));
      System.out.println(obj1.getmeback(50));

   }
}
