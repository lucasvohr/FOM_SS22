import static javax.swing.JOptionPane.*;

public class Uebung_8_5 {
    
    public static void main(String[] args){
      
        int eingabe = Integer.parseInt(showInputDialog("Geben Sie eine vier Stellige Zahl ein:"));

        try{

            Uebung_8_5_Check pruefung = new Uebung_8_5_Check();
            pruefung.check(eingabe);

        } catch (Uebung_8_5_Fehler e){

            System.err.println("Error-Message: " + e.getMessage() + "\n");

        }

    }

}
