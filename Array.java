public class Array {
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        int arr1[] = new int[10]; // to define the size of an array for dynamic allocation
       

        for(int i=0; i<arr1.length; i++){
           arr1[i] = (i+1)*10;
        } 
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

    }


}

