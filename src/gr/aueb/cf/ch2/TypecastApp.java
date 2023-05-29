package gr.aueb.cf.ch2;

/**
 * SSSSSSSSSSSSSOOOOOOOOOSSSSSSSSSSSS
 */
public class TypecastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20;
        long result = 0;

        // ΓΙΝΕΤΑΙ ΝΑ ΜΕΤΑΤΡΕΨΕΙΣ  ΤΟ int  ΣΕ long ΕΠΕΙΔΗ ΤΟ ΕΝΑ ΕΙΝΑΙ 32 bite ΚΑΙ ΤΟ ΑΛΛΟ 64 bite ΟΠΟΤΕ ΤΟ 32 bite ΧΩΡΑΕΙ ΜΕΣΑ ΣΤΟ 64 bite
        // ΤΟ ΑΝΤΙΣΤΡΟΦΟ ΔΕΝ ΓΙΝΕΤΑΙ ΚΑΙ ΠΡΕΠΕΙ ΝΑ ΤΟ ΚΑΝΕΙΣ MANUAL

        num1 = (int) num2;

        // ΑΝ ΘΕΛΩ ΝΑ ΚΑΝΩ ΑΣΚΗΣΕΙΣ ΜΕ ΔΙΑΦΟΡΕΤΙΚΟΥΣ ΤΥΠΟΥΣ ΓΙΝΕΤΑΙ ΑΥΤΟΜΑΤΑ ΣΤΟ ΜΕΓΑΛΥΤΕΡΟ ΤΥΠΟ
          result = num1 + num2;
    }
}
