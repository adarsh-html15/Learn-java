 class A{
    public void show(){
        System.out.println("This is class A");
    }

    class B{
        public void show(){
            System.out.println("This is class B");
        }
    }
}



public class classInclass {
    public static void main(String[] args) {
        A objA = new A();
       objA.show();

    A.B obj2 = objA.new B();
         obj2.show();
    }
}
