package gr.aueb.cf.ch3;
import java.util.Scanner;

/**
 * Η ΕΦΑΡΜΟΓΕΙ ΑΥΤΗ ΑΠΟΦΑΣΙΖΕΙ ΑΝ ΠΡΕΠΕΙ ΝΑ ΑΝΑΨΟΥΝ ΤΑ ΦΩΤΑ ΑΠΟ ΕΝΑ ΑΜΑΞΙ
 * ΜΕ ΒΑΣΗ ΤΡΕΙΣ ΜΕΤΑΒΛΗΤΕΣ
 * ΑΝ ΒΡΕΧΕΙ ΚΑΙ ΑΝ ΤΑΥΤΟΧΡΟΝΑ ΙΣΧΥΕΙ ΕΝΑ ΤΟΥΛΑΧΙΣΤΟΝ ΑΠΟ ΤΑ ΕΠΟΜΕΝΑ
 * ΕΙΝΑΙ ΣΚΟΤΑΔΙ Η ΑΝ ΤΡΕΧΟΥΜΕ ΜΕ
 * (SPEED>100)
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;
        boolean dark = false;
        boolean rain = false;
        boolean lights = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert the speed (int)");
        speed = scanner.nextInt();
        System.out.println("Please insert if its dark (true or false)");
        dark = scanner.nextBoolean();
        System.out.println("Please insert if its rain (true or false)");
        rain = scanner.nextBoolean();

        lights = rain && ((speed >= MAX_SPEED) || dark);
        System.out.println("The lights its on: " + lights);
    }
}
