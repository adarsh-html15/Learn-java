// object like caluculater to do something so obect is used to do something
// instance of class is called object
// class is a blueprint and object is an instance of class 

class calculator extends add{
    int a=5;
    int b=10;

    public int add() {
        return a + b;
    }
     public int sub() {
        return a - b;
    }
    public int mult(){
        return a * b;
    }
    public int div(int c, int d){
        return c / d;
    }

    public static void main(String args[]) {
        calculator calc = new calculator();
        int sum = calc.add();
        System.out.println("Sum: " + sum);
         int sub = calc.sub();
        System.out.println("Sub: " + sub);
        int mult = calc.mult();
        System.out.println("Mult: " + mult);
        int div = calc.div(20, 5);
        System.out.println("Div: " + div);

    }
}
