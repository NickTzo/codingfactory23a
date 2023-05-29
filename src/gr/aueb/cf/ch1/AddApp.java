package gr.aueb.cf.ch1;

public class AddApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων

        //**  αλλιως int num1 = 10,num2 = 7,result = 0;    **
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        //Εντολες
        result = num1 + num2;

        //Εκτυπωση αποτελεσματων
        System.out.println("Το αποτέλεσμα είναι: " + result);
        //**  Η printf μας δινει την ικανοτητα του format περνωντας τις τιμης που δινουμε  **
        System.out.printf("Το αποτελεσμα των %d , %d ειναι %d",num1, num2, result);
    }
}
