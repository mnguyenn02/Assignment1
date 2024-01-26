//#3 Not Fibbonacci
import java.util.Scanner;

public class NotFibbonacci {
    static void nFibbonacci(long n) {

        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");

            int next = (3 * num1) + (2 * num2);
            num1 = num2;
            num2 = next;
        }
    }

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("input: ");
        long n = user.nextInt();

        nFibbonacci(n);
    }
}


