package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * Ο ΧΡΗΣΤΗΣ ΕΙΣΑΓΕΙ START END ΚΑΙ STOP
 * ΚΑΙ ΤΥΠΩΝΕΙ ΑΝΤΙΣΤΟΙΧΑ ΑΣΤΕΡΑΚΙΑ
 */
public class StarsStepApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        System.out.println("Please insert star,end value and step");
        start = scanner.nextInt();
        end = scanner.nextInt();
        step = scanner.nextInt();

        i = start;
        while (i <= end) {
            System.out.println("*");
            i = i + step;
        }
    }
}
