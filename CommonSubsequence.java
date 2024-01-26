//#1 Common subsequence
import java.util.Scanner;

public class CommonSubsequence {
    static int longest(String text1, String text2) {

        int count = 0;

        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String [] args) {

        Scanner texts = new Scanner(System.in);

        System.out.println("text1:");
        String text1 = texts.nextLine();

        System.out.println("text2:");
        String text2 = texts.nextLine();

        System.out.println("Output:" + longest(text1, text2));

    }
}
