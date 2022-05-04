import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Uebung_9_4 {
    
    public static void main (String[] args){

        String pfad_input = "input";
        String pfad_output = "output";

        File datei = new File (pfad_input + ".txt");
        
        
        // Verfahren bei Nutzung eines Scanners
            
            System.out.println("\nEinlesen via Scanner-Funktion\n");    
            
            try{

                Scanner scanner = new Scanner(datei);
                    String scanner_puffer = "";

                File output_scanner = new File(pfad_output + ".txt");
                    Writer scanner_out = new FileWriter(output_scanner);             

                while(scanner.hasNextLine()){
                    scanner_puffer = scanner.nextLine() + "\n";
                    System.out.println(scanner_puffer);  
                    scanner_out.write(scanner_puffer);
                }

                scanner.close();
                scanner_out.close();

            } catch (IOException e){

                System.err.println("Fehler: " + e.getMessage());

            }


        // Verfahren bei Nutzung eines Readers
            
            System.out.println("Einlesen via Reader-Funktion\n");       
            pfad_output += "_reader";

            try{

                File output_reader = new File(pfad_output + ".txt");
                Writer reader_out = new FileWriter(output_reader);

                Reader reader = new FileReader(datei);
                int reader_input = 0;

                while((reader_input = reader.read()) != -1){
                    System.out.print( (char) reader_input);
                    reader_out.write( (char) reader_input);
                }
            
                reader.close();
                reader_out.close();

            } catch (IOException e){

                System.err.println("Fehler: " + e.getMessage());

            }           

    }

}
