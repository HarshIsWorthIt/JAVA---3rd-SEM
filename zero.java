import java.util.*;

class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String s = sc.nextLine();

        int i = 0;

        while (i < s.length() - 1 && s.charAt(i) == '0')
            i++;

        System.out.println(s.substring(i));
        sc.close();
    }
}
