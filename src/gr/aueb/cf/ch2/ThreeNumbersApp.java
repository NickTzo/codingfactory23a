package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * ΖΗΤΑΕΙ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ 3 ΑΚΕΡΑΙΟΥΣ
 * ΤΟΥΣ ΜΕΙΩΝΕΙ ΚΑΤΑ 1 ΜΟΝΑΔΑ
 * ΚΑΙ ΤΟΥΣ ΕΝΦΑΝΙΖΕΙ ΜΕ ΤΗΝ ΙΔΙΑ ΣΕΙΡΑ ΠΟΥ ΔΩΘΗΚΑΝ
 * ΑΦΗΝΟΝΤΑΣ ΕΝΑ ΚΕΝΟ ΑΝΑΜΕΣΑ ΤΟΥΣ
 */
public class ThreeNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert 3 integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        //ΓΙΝΕΤΑΙ ΚΑΙ ΜΕ ΤΟΥΣ 3 ΤΡΟΠΟΥΣ ΚΑΤΑ ΠΡΟΤΙΜΗΣΕΙ ΤΟΝ 2ο ΤΡΟΠΟ

        num1 -= 1;
        num2 --;
        num3 = num3 -1;


        System.out.printf("%d %d %d", num1 , num2 , num3);

    }
}
