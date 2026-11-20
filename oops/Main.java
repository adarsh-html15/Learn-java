//  Encapsulation is a process of wrapping code and data together into a single unit.
//  In encapsulation, the variables or data of a class are hidden from other classes and can be accessed only through the methods of their current class.
//  Therefore, it is also known as data hiding.
class encapsulation {
    private int id =10; 
    private String name = "Adarsh";
    // beacuse the variables are private, we cannot access them directly from outside the class.
    //  So, we need to create public getter methods to access these private variables.
    public int getid() {
        return id;
    }
    //  public setter methods are used to set the value of private variables.
    public void setid(int n) {
        this.id = n;
        //" this " is used to refer to the current object of the class.
        // It is used to differentiate between the instance variable and the local variable when they have the same name.
    }

    public String getname(){
        return name;
    }
    public void setname(String n) {
        this.name = n;
    }


}

public class Main {
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        System.out.println(obj.getid());
        System.out.println(obj.getname());

        obj.setid(20);
        obj.setname("Aakansha");
        System.out.println(obj.getid());
        System.out.println(obj.getname());
    }
}
