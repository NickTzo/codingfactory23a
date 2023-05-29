package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβανει 3 τιμες απο τον χρηστη τις
 * a , b , c οπου a ειναι η υποτεινουσα και
 * b , c οι δυο τιμες
 * ελεγχει αν το τιργωνο ειναι ορθογωνιο , δηλαδη
 * a^2==b^2 + c^2
 * Εστω EPSILON 0.000005 συμαντικα στοιχεια ακριβειας
 */

public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;
        System.out.println("please insert 3 double numbers");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if(Math.abs(a*a-(b*b+c*c))<=EPSILON){
            System.out.println("EINAI");
        }else {
            System.out.println("DEN EINAI");
        }

    }
}
