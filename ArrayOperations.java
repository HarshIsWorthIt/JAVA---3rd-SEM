import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n, choice, pos, element;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\n1. Insert an element");
        System.out.println("2. Delete an element");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            // Insertion
            System.out.print("Enter position for insertion (1 to " + (n + 1) + "): ");
            pos = sc.nextInt();

            System.out.print("Enter element to insert: ");
            element = sc.nextInt();

            if (pos < 1 || pos > n + 1) {
                System.out.println("Invalid position!");
            } else {
                // Shift elements to the right
                for (int i = n; i >= pos; i--) {
                    arr[i] = arr[i - 1];
                }

                arr[pos - 1] = element;
                n++;

                System.out.println("Array after insertion:");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

        } else if (choice == 2) {
            // Deletion
            System.out.print("Enter position to delete (1 to " + n + "): ");
            pos = sc.nextInt();

            if (pos < 1 || pos > n) {
                System.out.println("Invalid position!");
            } else {
                // Shift elements to the left
                for (int i = pos - 1; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }

                n--;

                System.out.println("Array after deletion:");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}