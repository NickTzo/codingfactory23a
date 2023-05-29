package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * ΑΠΟΦΑΣΙΖΕΙ ΑΝ ΧΙΟΝΙΖΕΙ Η ΟΧΙ ΜΕ ΒΑΣΕΙ
 * ΟΧΙ ΜΟΝΟ ΤΗΝ ΘΕΡΜΟΚΡΑΣΙΑ ΑΛΛΑ ΚΑΙ ΤΟ ΑΝ ΒΡΕΧΕΙ
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rain = false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert temperature and if its rain (with true or false)");
        temp = scanner.nextInt();
        rain = scanner.nextBoolean();

        isSnowing = (temp < 0) && (rain = true);

        System.out.println("Is snowing: " + isSnowing);

    }
}
