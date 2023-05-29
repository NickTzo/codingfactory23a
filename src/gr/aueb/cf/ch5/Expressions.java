package gr.aueb.cf.ch5;

public class Expressions {
    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 2.0;
        double reuslt = 0.0;
        double mod = 0.0;

        reuslt = num1 / num2;   //6,25
        mod = num1 % num2;      //0,50

        System.out.printf("%.2f / %.2f = %.2f\n",num1 , num2 , reuslt);
        System.out.printf("%.2f %% %.2f = %.2f",num1 , num2 , mod);
    }
}
