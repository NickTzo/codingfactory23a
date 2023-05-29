package gr.aueb.cf.ch9;

/**
 * Διαβαζει εικονες και βιντεο byte byte μεσα απο φακελο
 * ΕΙΝΑΙ ΜΕ ΔΥΟ ΤΡΟΠΟΥΣ ΔΕΣ ΠΑΡΑΚΑΤΩ
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {
    public static void main(String[] args) {

        int b = 0;
        int count = 0;
        byte[] buffer = new byte[4096];
        long start , end;
        double elapse;

        try(FileInputStream in = new FileInputStream("C:/tmp/v1.mp4");
            FileOutputStream out =  new FileOutputStream("C:/tmp/v1out.mp4")) {
            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1){
                out.write(buffer , 0 , b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapse = (end - start) / 1000.0;
            System.out.println(elapse + "secs");
            System.out.printf("%,.2f KB" , (double) count / 1024);


        }catch (IOException e){
            throw new RuntimeException();
        }
    }


    /**
     * ΔΕΥΤΕΡΟΣ ΤΡΟΠΟΣ ΜΕ BUFFER
     */



//    public static void main(String[] args) {
//
//        int b = 0;
//        int count = 0;
//        byte[] buffer = new byte[4096];
//        long start , end;
//        double elapse;
//
//        try(BufferInputStream in = new BufferInputStream(new FileInputStream("C:/tmp/v1.mp4"));
//            BufferOutputStream out =  new BufferOutputStream(new FileOutputStream("C:/tmp/v1out.mp4"))) {
//            start = System.currentTimeMillis();
//            while ((b = in.read(buffer)) != -1){
//                out.write(buffer , 0 , b);
//                count += b;
//            }
//            end = System.currentTimeMillis();
//            elapse = (end - start) / 1000.0;
//            System.out.println(elapse + "secs");
//            System.out.printf("%,.2f KB" , (double) count / 1024);
//
//
//        }catch (IOException e){
//            throw new RuntimeException();
//        }
//    }
}
