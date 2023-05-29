package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * Ο ΧΡΗΣΤΗΣ ΔΙΝΕΙ ΕΝΑ ΔΙΨΗΦΙΟ ΑΚΕΡΑΙΟ ΚΑΙ
 * ΒΡΙΣΚΟΥΜΕ ΤΟ ΑΘΡΟΙΣΜΑ ΤΩΝ ΔΥΟ ΨΗΦΙΩΝ
 */
public class IntTwoDigitsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int rightDigit = 0;
        int leftDigit = 0;
        int sum = 0;

        System.out.println("Please insert number with two digits");
        num = scanner.nextInt();
        leftDigit = num / 10;
        rightDigit = num % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("%d the number and for the left digit is %d and for the right digit is %d and the sum is %d",
                num , leftDigit , rightDigit , sum);
    }
}
