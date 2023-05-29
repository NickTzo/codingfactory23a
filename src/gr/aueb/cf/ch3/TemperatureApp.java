package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * ΑΠΟΦΑΣΙΖΕΙ ΑΝ ΧΙΟΝΙΖΕΙ ΜΕ ΒΑΣΗ ΤΗΝ ΘΕΡΜΟΚΡΑΣΙΑ
 * ΑΝ Η ΘΕΡΜΟΚΡΑΣΙΑ ΕΙΝΑΙ ΜΙΚΡΟΤΕΡΗ ΑΠΟ ΜΗΔΕΝ
 * ΤΟΤΕ ΧΙΟΝΙΖΕΙ ΑΛΛΙΩς ΔΕΝ ΧΙΟΝΙΖΕΙ Ο ΧΡΗΣΤΗΣ ΔΙΝΕΙ ΤΗΝ ΘΕΡΜΟΚΡΑΣΙΑ
 */
public class TemperatureApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = scanner.nextInt();

        isSnowing = (temp < 0);
        System.out.println("Is snowing " + isSnowing);
    }
}
