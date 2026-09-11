import java.util.*;

class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        char[] x = a.toLowerCase().toCharArray();
        char[] y = b.toLowerCase().toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
        sc.close();
    }
}
