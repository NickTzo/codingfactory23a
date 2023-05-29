package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1; // κανουμε παντα typecast γιατι η math random δινει παντα float
        System.out.println(die);
    }
}
