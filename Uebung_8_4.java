import java.util.Arrays;
import static javax.swing.JOptionPane.*;

public class Uebung_8_4 {
    
    public static void main(String[] args){

        //Uebung_8_Fehlermeldung fehler = new Uebung_8_Fehlermeldung();
        Uebung_8_4_Fehlerpruefung pruefung = new Uebung_8_4_Fehlerpruefung();

        int anzahl_einträge = Integer.parseInt(showInputDialog("Geben Sie die Anzahl Einträge für den Array ein:"));
        
        
        try{

            pruefung.pruefen(anzahl_einträge);

            int[] array = new int[anzahl_einträge];
                
            for(int i = 0; i < array.length; i++){
                array[i] = i+1;
            }

            System.out.println(Arrays.toString(array));

        } catch (Uebung_8_4_Fehlermeldung e){

            System.err.println(e.getMessage());
            
        }

    }

}
