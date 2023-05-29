package gr.aueb.cf.ch2;

import java.util.Scanner;
/**
 * ΜΕΤΑΤΡΕΠΕΙ ΤΟ EURO ΣΕ USD
 * ΛΑΜΒΑΝΕΙ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΕΝΑ ΑΚΕΡΑΙΟ
 * ΠΟΥ ΣΥΜΒΟΛΙΖΕΙ ΤΟ ΠΟΣΟ ΣΕ EURO ΚΑΙ ΜΕΤΑΤΡΕΠΕΙ
 * ΣΕ ΔΟΛΛΑΡΙΑ ΚΑΙ ΕΝΦΑΝΙΖΕΙ ΤΟ ΠΟΣΟ ΣΕ USD
 */
public class EuroToUsdConverterApp {
    public static void main(String[] args) {

        // ΔΗΛΩΣΗ ΚΑΙ ΑΡΧΙΚΟΠΟΙΗΣΗ
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        //ΕΝΤΟΛΕΣ
        System.out.println("Please insert an amount (in EURO)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //ΕΚΤΥΠΩΣΗ ΑΠΟΤΕΛΕΣΜΑΤΩΝ
        System.out.printf("%d Euros = %d Usa Dollars , %d USA Cents", inputEuros , usaDollars , usaCents);


    }
}
