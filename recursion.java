import java.util.Scanner;

class recursion {
    static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * powerRecursive(base, exponent - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base: ");
            int base = sc.nextInt();

            System.out.print("Enter exponent: ");
            int exponent = sc.nextInt();

            System.out.println("Power using recursion: "
                    + powerRecursive(base, exponent));
        }
    }
}
