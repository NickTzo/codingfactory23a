package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {
    public static void main(String[] args) {                                     //append //autoFlush //Ellinika
        try(PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/fos.txt",true),true, StandardCharsets.UTF_8)){
            ps.println("Καλησπερα");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
