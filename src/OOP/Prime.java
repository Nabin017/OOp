package OOP;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int i, j, n, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Prime numbers are : ");
        for (i = 2; i <= n; i++) {
            c = 0;
            for (j = 1; j <= i; j++)

                if (i % j == 0)
                {
                    c++;
                }
            if (c == 2) {
                System.out.println(i + "");

            }

        }
    }
}