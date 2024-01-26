//#4 Where In Sequence
import java.util.Scanner;

public class WhereInSequence {
    static int nFibbonacci(long n) {

        long num1 = 0;
        long num2 = 1;
        int position = 1;

        while(true) {
            if(num1 == n) {
                return position;
            }
            else if(num1 > n) {
                return position - 1;
            }

            long next = (3 * num1) + (2 * num2);
            num1 = num2;
            num2 = next;
            position++;
        }
    }

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Input: ");
        long n = user.nextLong();

        int position = nFibbonacci(n);
        System.out.println("Output: " + position);
    }

}
