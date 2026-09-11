import java.util.Scanner;

class array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int result[] = new int[5];

        System.out.println("Enter 5 elements:");

        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++)
        {
            result[(i + 2) % 5] = a[i];
        }

        System.out.println("Result:");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}