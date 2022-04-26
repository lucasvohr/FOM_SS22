import java.util.Arrays;
import static javax.swing.JOptionPane.*;

public class Uebung_8_3 {
    
    public static void main(String[] args){

        int anzahl_einträge = Integer.parseInt(showInputDialog("Geben Sie die Anzahl Einträge für den Array ein:"));
        int[] array = new int[anzahl_einträge];

        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }

        System.out.println(Arrays.toString(array));

        // Bei einem negativen Wert würde die Fehlermeldung "java.lang.NegativeArraySizeException: -..." geworfen und das Programm abgebrochen.

    }

}
