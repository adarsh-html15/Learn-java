

// 1. Custom exception banane ke liye Exception class ko extends karna zaroori hai.
public class customException extends Exception {

    // Warning ko avoid aur exception ko serializable banane ke liye serialVersionUID.
    private static final long serialVersionUID = 1L;

    // 2. Constructor wahi message parent Exception class ko pass karta hai.
    public customException(String message) {
        super(message);
    }

    // 3. throws ka matlab hai ki method error throw kar sakti hai.
    // checked exception hone ki wajah se caller ko try-catch ya throws dena padta hai.
    public static void validateAge(int age) throws customException {
        if (age < 18) {
            // 4. Yahan Java mein new ke saath custom exception create aur throw hoti hai.
            throw new customException("Umra 18 se kam hai");
        }

        System.out.println("Umra valid hai");
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (customException exception) {
            // Constructor ko diya gaya message getMessage() se milta hai.
            System.out.println("Custom Exception: " + exception.getMessage());
        }
    }
}
                            