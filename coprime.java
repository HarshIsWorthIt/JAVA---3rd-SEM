import java.util.Scanner;

public class coprime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {

            int a = n;
            int b = i;

            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }

            if (a == 1) {
                count++;
            }
        }

        System.out.println("Count of numbers coprime to " + n + " = " + count);

        sc.close();
    }
}
