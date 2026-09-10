import java.util.Scanner;

// First exception
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Second exception
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

// Third exception
class DailyLimitException extends Exception {
    DailyLimitException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        double dailyLimit = 5000;
        double withdrawnToday = 0;

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            if (amount <= 0) {
                throw new InvalidAmountException("Amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance.");
            }

            if (withdrawnToday + amount > dailyLimit) {
                throw new DailyLimitException(
                    "Daily withdrawal limit of Rs. 5000 exceeded."
                );
            }

            balance -= amount;
            withdrawnToday += amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: Rs. " + balance);

        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (DailyLimitException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
