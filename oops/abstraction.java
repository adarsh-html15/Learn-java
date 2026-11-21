// Hideing the implementation details from the user is called abstraction.
// In Java, abstraction is achieved using abstract classes and interfaces.
// It allows us to focus on what an object does instead of how it does it.

// Abstract class sirf payment ki "kya karna hai" ki soch define karti hai.
abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method: implementation subclasses me chhupi hai.
    abstract void pay();
}

// Card payment ki implementation.
class CardPayment extends Payment {
    CardPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Card se Rs." + amount + " pay kiye.");
    }
}

// UPI payment ki implementation.
class UpiPayment extends Payment {
    UpiPayment(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("UPI se Rs." + amount + " pay kiye.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // Reference abstract class ka hai, par object concrete class ka hai.
        CardPayment card = new CardPayment(500);
        UpiPayment upi = new UpiPayment(300);

        card.pay();
        upi.pay();
    }
}


