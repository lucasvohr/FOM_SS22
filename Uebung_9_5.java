import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Uebung_9_5 {
    
    public static void main (String[] args){

        try{

            
            BufferedReader input_reader = new BufferedReader(new InputStreamReader(System.in)); 
            String text = "";
            String input_string = "";

            do{

                System.out.println("\nBitte geben Sie das nächste Wort ein (X für Abbruch):");
                input_string =  input_reader.readLine();

                if(input_string.equals("X")){
                    
                    System.out.println("\nDie Eingabe war:\n" + text);
                
                } else {
                    
                    input_string = input_string.replace(" ", "");
                    text += input_string + " ";
                
                }

            } while (!input_string.equals("X"));

        
        } catch (IOException e){

            System.err.println("Fehler: " + e.getMessage());

        }

    }

}
