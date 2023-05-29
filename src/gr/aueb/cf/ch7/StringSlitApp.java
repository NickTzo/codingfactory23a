package gr.aueb.cf.ch7;

/**
 * Split a string
 */
public class StringSlitApp {
    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Business";

        String[] tokens =  s.split(" ");

        for(String token: tokens){
            System.out.println(token);
        }
    }
}
