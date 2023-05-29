package gr.aueb.cf.ch3;
import java.util.Scanner;

/**ΥΠΟΛΟΓΙΖΕΙ ΤΟ ΑΘΡΟΙΣΜΑ ΚΑΙ ΜΕΤΑ ΤΟ ΓΙΝΟΜΕΝΟ
 * ΤΩΝ 10 ΠΡΩΤΟΝ ΑΚΕΡΑΙΩΝ
 *
 */
public class SumAndMul10App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        int mul = 1;

        System.out.println("Please insert number");
        i = scanner.nextInt();

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
        }
        System.out.println("ΑΘΡΟΙΣΜΑ:"+sum);
        System.out.println("ΓΙΝΟΜΕΝΟ:"+mul);
    }
}

