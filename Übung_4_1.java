import static javax.swing.JOptionPane.*;

import java.util.Arrays;

public class Übung_4_1{

    public static void main(String[] args){

        // Array mit Wunsch-Anzahl anlegen
            String eingabe = showInputDialog("Geben Sie die Anzahl der einzugebenden Zahlen ein:");
            double werte[] = new double[Integer.parseInt(eingabe)];

        // Werte einlesen
            for(int i = 0; i < werte.length; i++)
                werte[i] = Double.parseDouble(showInputDialog("Geben Sie Wert " + (i+1) + " ein:"));
            Arrays.sort(werte);

        // Durchschnitt berechnen (Arithmetisches Mittel)
            double summe = 0;
            for (int i = 0; i < werte.length; i++)
                summe += werte[i];
            System.out.println("Der Durchschnitt vom Array " + Arrays.toString(werte) + " mit " + Integer.parseInt(eingabe) + " Elementen lautet: " + (summe / Integer.parseInt(eingabe)));

    }

}