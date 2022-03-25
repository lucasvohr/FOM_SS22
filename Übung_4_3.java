import static javax.swing.JOptionPane.*;

public class Übung_4_3 {
    
    public static void main(String[] args){

        String eingabe = showInputDialog("Geben Sie einen Wert an:");
        int modus = 0;

        try{
            modus = Integer.parseInt(showInputDialog("Geben Sie den gewünschten Modus an (1 = Integer, 2 = Double, 3 = ohne Konvertierung):"));
        } catch (Exception e) {
            modus = 0;
        }

        switch(modus){
            case 1: System.out.println((int)(Double.parseDouble(eingabe))); break;
            case 2: System.out.println(Double.parseDouble(eingabe)); break;
            case 3: System.out.println(eingabe); break;
            default: System.out.println("Keine Auswahl vorgenommen!");
        }

    

    }

}
