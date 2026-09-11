import java.util.Scanner;
public class ATM {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM");
        System.out.print("Please insert your card: ");
        scanner.nextLine();
        System.out.print("Please enter your PIN: ");
        scanner.nextLine();
        System.out.println("Authentication successful!");
    }           
}
