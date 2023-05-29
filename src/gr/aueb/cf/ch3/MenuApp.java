package gr.aueb.cf.ch3;
import java.util.Scanner;
/**ΕΝΦΑΝΙΖΕΙ ΕΠΑΛΗΠΤΙΚΑ ΕΝΑ ΜΕΝΟΥ
 * ΕΠΙΛΟΓΩΝ ΜΕΧΡΙ Ο ΧΡΗΣΤΗΣ ΝΑ ΕΠΙΛΕΞΕΙ ΕΞΟΔΟ
 *
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("ΕΠΙΛΕΞΤΕ ΕΝΑ ΑΠΟ ΤΑ ΠΑΡΑΚΑΤΩ");
            System.out.println("1.ΕΙΣΑΓΩΓΗ");
            System.out.println("2.ΔΙΑΓΡΑΦΗ");
            System.out.println("3.ΕΞΟΔΟΣ");
            choice = scanner.nextInt();
        } while (choice != 3);
    }
}
