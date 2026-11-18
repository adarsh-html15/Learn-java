
public class condition {

    public static void main(String args[]){ 
        int num = 10;
        int num2 = 30;
        String result = "";

        // method-1
        if(num % 2 == 0){
            System.out.println("This is even number");  
        }else{
            System.out.println("This is odd number");
        }
        // method-2
        if(num2 % 2 == 0)
            System.out.println("This is even number");
        else
            System.out.println("This is odd number");

        // method-3
        
        result = num%2 == 0 ?"even":"odd";
        System.out.println("This is " + result + " number"); 
      

    }
    
}
