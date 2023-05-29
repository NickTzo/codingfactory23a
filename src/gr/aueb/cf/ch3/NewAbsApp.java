package gr.aueb.cf.ch3;
import java.util.Scanner;

/**
 * Ternary Operator
 */
public class NewAbsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please provide a num");
        num = scanner.nextInt();

        abs = (num > 0) ? num : -num;     // ΕΝΑ ΘΕΛΟΥΜΕ ΜΟΝΟ ΤΟ IF ΣΕ ΜΙΑ ΓΡΑΜΜΗ

        // abs = (num > 0) ? num : (num < 0) ? -num : 0;   ΕΑΝ ΘΕΛΑΜΕ ΝΑ ΚΑΝΑΜΕ ΤΟ IF ELSE ΣΕ ΜΙΑ ΓΡΑΜΜΗ

        // Το ? ειναι το then  και το : ειναι το else   SSSSSSOOOOOOOSSSSSS

        System.out.println("Abs: " + abs);

    }
}
