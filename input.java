
import java.util.Scanner;

public class input {

    // Factorial n! = n * (n - 1) * ... * 1
    // Base case n <= 1 infinite recursion ko rokta hai
    public static int factor(int number) {
        if (number <= 1) {
            return 1;
        }

        return number * factor(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("This given number is: " + num);
        System.out.println("Factorial is: " + factor(num));

        scan.close();
    }
}
