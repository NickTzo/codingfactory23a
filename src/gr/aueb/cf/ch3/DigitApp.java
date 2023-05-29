package gr.aueb.cf.ch3;
import java.util.Scanner;
/**ΥΠΟΛΟΓΙΖΕΙ ΤΟ ΠΛΗΘΩΣ ΤΩΝ ΨΗΦΙΩΝ ΕΝΩΣ ΑΚΕΡΑΙΟΥ
 * ΤΟ ΑΘΡΟΙΣΜΑ ΤΩΝ ΨΗΦΙΩΝ
 * ΚΑΙ ΤΟ ΑΘΡΟΙΣΜΑ ΤΟΥ ΠΡΩΤΟΥ ΨΗΦΙΟΥ ΚΑΙ ΤΟΥ ΤΕΛΕΥΤΑΙΟΥ
 */
public class DigitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int sum = 0;
        int count = 0;
        int sumLeftRight = 0;
        int courentDigit = 0;
        int rightmost = 0;
        int leftmost= 0;

        System.out.println("Please insert num");
        inputNum = scanner.nextInt();
        num = inputNum;
        do {
            count ++;
            courentDigit = num % 10;
            sum += courentDigit;
            if (count == 1){
                rightmost = courentDigit;
            }
            num = num / 10;
        } while (num != 0);
            leftmost = courentDigit;
            sumLeftRight = leftmost + rightmost;
            System.out.println("Count:" + count);
            System.out.println("Sum:" + sum);
            System.out.println("Sum of leftmost and rightmost digits" + sumLeftRight);
    }
}
