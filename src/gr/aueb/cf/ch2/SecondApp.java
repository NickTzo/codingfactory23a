package gr.aueb.cf.ch2;
import java.util.Locale;
import java.util.Scanner;

/**
 * ΔΙΑΒΑΖΕΙ ΩΡΕΣ ΛΕΠΤΑ ΚΑΙ ΔΕΥΤΕΡΑ ΚΑΙ
 * ΜΕΤΑΤΡΕΠΕΙ ΣΕ ΔΕΥΤΕΡΟΛΕΠΤΑ
 */
public class SecondApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputhours = 0;
        int inputmin = 0;
        int inputsec = 0;
        int totalsec = 0;
        final int SECONDS_PER_HOURS = 3600;
        final int SECONDS_PER_MIN = 60;

        System.out.println("Please insert hours minutes and seconds");
        inputhours = scanner.nextInt();
        inputmin = scanner.nextInt();
        inputsec = scanner.nextInt();

        totalsec = inputhours * SECONDS_PER_HOURS + inputmin * SECONDS_PER_MIN + inputsec;
        System.out.printf(Locale.forLanguageTag("el"),"%d hours , %d minutes , %d seconds = %,d total seconds",
                inputhours , inputmin , inputsec , totalsec);
    }
}
