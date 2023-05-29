package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriterApp {
    public static void main(String[] args) throws FileNotFoundException {
        try(PrintStream ps = new PrintStream("C:/tmp/text1.txt");
            PrintWriter pw =  new PrintWriter("C:/tmp/test2.txt")){
            ps.println("Hello CF1 from print stream");
            pw.println("Hello CF1 from print writter");
            pw.flush();
        }catch (FileNotFoundException e){
            System.out.println("File Not found");
        }
        //2ο παραδειγμα για να παιρνει και ελληνικα
        try(PrintStream ps = new PrintStream("C:/tmp/text1.txt", StandardCharsets.UTF_8)){
            ps.println("Hello CF1 from print stream");

            }catch (IOException e){
           e.printStackTrace();
        }
    }
}
