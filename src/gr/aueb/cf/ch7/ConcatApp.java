package gr.aueb.cf.ch7;

/**
 * Concat 2 or more strings
 */
public class ConcatApp {
    public static void main(String[] args) {
        String title = "Dr";
        String firstName = "Athan";
        String lastName = "Androustos";
        String fullName;
        String titleFullName;

        fullName = title+firstName + lastName;
        System.out.println(fullName);

        titleFullName = title.concat(firstName).concat(lastName);
        System.out.println(titleFullName);
    }
}
