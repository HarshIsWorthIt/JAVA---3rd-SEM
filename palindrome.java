import java.util.Scanner;


        class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            if (str.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        } finally {
            sc.close();
        }
    }
}