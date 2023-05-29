package gr.aueb.cf.ch2;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 185_681_681;
//        System.out.print(i);
//        System.out.println(i);
//        System.out.printf("%d",i);
//
//        System.out.println("result =" + i);
//        System.out.println("result = " + i);
//        System.out.printf("Result = %d \n" , i);

        System.out.printf("%03d",i); //Οταν θελω να αφησω κενα (μηδενικα) μπροστα απο το νουμερο
        System.out.printf("%,02d",i); //Οταν θελω να ενφανιστει με κομματα
    }
}
