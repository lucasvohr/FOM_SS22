import static javax.swing.JOptionPane.*;

public class Uebung_8_1 {
    
    public static void main(String[] args){

        int wert;
        String eingabe = showInputDialog("Geben Sie einen Wert ein");

        wert = Integer.parseInt(eingabe);
        System.out.println(wert);

        // Wenn die Eingabe einen Buchstaben enthält, wird eine "NumberFormatException" geworfen

    }

}
