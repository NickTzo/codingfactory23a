package gr.aueb.cf.ch6;

/**
 * Λαμβανει ως input ενα πινακα βαθμολογιων (ακεραιων απο 0 - 100)
 * και ενφανιζει την κατανανομη των βαθμων σε ενα chart
 */
public class GradesDistributionApp {
    public static void main(String[] args) {
        int[] grades = {30, 82, 9, 45, 25, 96, 26, 98, 2, 100, 98, 65, 52, 10, 15, 70};
        int[] count = new int[10];

        for (int grade : grades) {
            if (grade == 100) {
                count[9]++;
            } else {
                count[grade / 10] += 1;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%02d - %02d", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
            System.out.println();
            for (int j = 1; j <= count[i]; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
