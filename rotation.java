import java.util.*;

class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int first = a[0];

        for (int i = 0; i < n - 1; i++)
            a[i] = a[i + 1];

        a[n - 1] = first;

        System.out.println("Rotated array:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        sc.close();
    }
}
