import static javax.swing.JOptionPane.*;

public class Uebung_8_2 {
    
    public static void main(String[] args){

        int wert;
        String eingabe = showInputDialog("Geben Sie einen Wert ein");

        try{
            wert = Integer.parseInt(eingabe);
            System.out.println(wert);
        } catch (NumberFormatException e){
            System.err.println(e.getMessage() + " | FEHLER: Eingabe kann nicht in INTEGER konvertiert werden, da Buchstaben oder Sonderzeichen enthalten sind.");
        }
        


        

    }

}
