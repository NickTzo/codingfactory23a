package gr.aueb.cf.ch5;

/**
 * ανταλλασσει αμοιβαια δυο τιμες
 * που δινει ο χρηστης
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("a = " + a + " b = "+b);
    }

    /**   swap a,b -> a->b , b->a
     *
     * @param a the first value
     * @param b the second value
     */
    public static void swap(int a,int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
