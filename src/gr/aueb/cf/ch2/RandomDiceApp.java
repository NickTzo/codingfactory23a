package gr.aueb.cf.ch2;

/**
 * ΡΙΧΝΟΥΜΕ ΔΥΟ ΖΑΡΙΑ
 */
public class RandomDiceApp {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;

        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Dice1: %d , Dice2: %d" , dice1 , dice2);
    }
}
