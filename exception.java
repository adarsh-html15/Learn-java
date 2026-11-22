// Error
// runtime error handling is known as exception handling
// compile time error
// logic error

public class exception {
  

    public static void main(String[] args) {
      int i =0;
      int j =0;
      int arr[] = new int[5];
      try{
          j = 10/i; // ArithmeticException: / by zero
          arr[10] = 5; // ArrayIndexOutOfBoundsException
          if(j==0){
            throw new Exception("this will through the exception");
          }
      } catch(ArithmeticException e){
         // if there is an prob then we can execute default value like
         j = 10/1;
         System.out.println("error"+e);
      } catch(ArrayIndexOutOfBoundsException e){
         System.out.println("error"+e);
      } catch(Exception e){
        // ye sbke liye hai agar koi define nhi kiya hai catch me tab 
         System.out.println("error"+e);
      }
      finally{
         // finally block is used to execute the code after try catch block
        System.out.println("this is finally block");
      }

      System.out.println("j = " + j);
    
    };
};
