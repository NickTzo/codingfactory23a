package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβαζει απο ενα αρχειο με μορφη δεδομενων
 * country1 city1 city2 city3.....
 * country2 city1 city2 city3....
 *
 * και γραφει καθε γραμμη σε διαφορετικο output αρχειο
 *
 * Χρησιμοποιουμε το java IO package
 */
public class CitiesIOApp {
    public static void main(String[] args) {
        String line;
        String[] cities;

        File dir = new File("C:/tmp");


        if(!dir.exists()){
            if(!dir.mkdir()){
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }
        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))){
            while((line = bf.readLine()) != null){
                cities = line.split(" +");
                switch (cities[0]){
                    case "Greece":
                        File grFile = new File(dir+"/"+cities[0].toLowerCase().substring(0,2)+".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr,"Gr Cities");
                        print(gr,cities);
                        break;
                    case "USA":
                        File usaFile = new File(dir+"/"+cities[0].toLowerCase().substring(0,2)+".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa,"USA Cities");
                        print(usa,cities);
                        break;
                    case "England":
                        File enFile = new File(dir+"/"+cities[0].toLowerCase().substring(0,2)+".txt");
                        PrintStream en = new PrintStream(enFile, StandardCharsets.UTF_8);
                        print(en,"En Cities");
                        print(en,cities);
                        break;
                    default:
                        System.err.println("Error in cities");
                        break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void print(PrintStream ps,String message){
        ps.println(message);
    }

    public static void print(PrintStream ps, String[] tokens){
        for(int i = 1; i < tokens.length; i++){
            ps.println(tokens[i]+" ");
            // γινεται και να καλεσουμε το ευατο της μεσα στην ιδια
            // print(ps,tokens[i] + " ");
        }
    }
}
