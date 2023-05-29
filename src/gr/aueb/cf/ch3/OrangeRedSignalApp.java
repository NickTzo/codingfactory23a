package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * ΕΝΑ ΑΕΡΟΣΚΑΦΟΣ ΕΧΕΙ ΔΥΟ ΔΕΞΑΜΕΝΕΣ
 * ΑΝ ΜΙΑ ΔΕΞΑΜΕΝΗ ΕΧΕΙ ΛΙΓΟΤΕΡΟ
 * ΑΠΟ 1/4 ΚΑΥΣΙΜΟΥ ΤΟΤΕ ΑΝΑΒΕΙ ΠΟΡΤΟΚΑΛΙ ΣΗΜΑ ΕΝΩ ΑΝ ΚΑΙ ΟΙ ΔΥΟ ΔΕΞΑΜΕΝΕΣ ΕΧΟΥΝ ΛΙΓΟΤΕΡΟ ΑΠΟ
 * 1/4 ΚΑΥΣΙΜΟΥ ΤΟΤΕ ΑΝΑΒΕΙ ΚΟΚΚΙΝΟΣΗΜΑ
 * Ο ΠΙΛΟΤΟΣ(ΧΡΗΣΤΗΣ) ΔΙΝΕΙ TRUE Η FALSE ΑΝΑΛΟΓΑ ΑΝ Η ΔΕΞΑΜΕΣ ΕΙΝΑΙ < 1/4 Η ΟΧΙ
 */
public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean tank1 = false;
        boolean tank2 = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank1 has more than 1<4 fuel");
        tank1 = scanner.nextBoolean();
        System.out.println("Please insert if tank2 has more than 1<4 fuel");
        tank2 = scanner.nextBoolean();
        orangeOn = tank1 || tank2;
        redOn = tank1 && tank2;

        System.out.println("Orange ON: "+orangeOn);
        System.out.println("Red On: "+redOn);
    }
}
