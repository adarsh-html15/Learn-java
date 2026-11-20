//this and super
// inheritance is a concept in which a class inhert other classes's properties.
class class1 {
    public class1() {
        super();
        System.out.println("this is class 1");
    }

    public String location() {
        return "this is fr chankig the inheritance power";
    }

}

class class2 extends class1 {
    public class2() {
        super();// there is alwyas a super class in constructor so when we call the class first
                // it will go to the super class.
        System.out.println("this is class 2");
    }
    public class2(int b){
        System.out.println(b +"class2");
    }

}

class class3 extends class2 {
    public class3() {
        System.out.println("this is class 3");
    }
    

    public class3(int a) {
        this();
        // this() calls the no-argument constructor above.
        System.out.println(a + " class3");
    }
    public int add(int a, int b){
        return a + b ;
    }

    @Override // this is used to call the method of the super class.
    public String location() {
        return "ye class3 ka hai ";
    }

}

public class inheritance {
    public static void main(String[] args) {
        class2 obj = new class2();
        System.out.println(obj.location());
        class3 obj2 = new class3(7);
        System.out.println(obj2.add(3,6));
        System.out.println(obj2.location());
        
    }
}
