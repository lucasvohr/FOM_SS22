import static javax.swing.JOptionPane.*;

public class Uebung_8_6 {
    
    public static void main(String[] args){

        try{

            Uebung_8_6_Check check = new Uebung_8_6_Check();
            
            String eingabe = showInputDialog("Passwort eingeben:");
            check.login(eingabe);

        } catch (Uebung_8_6_Fehler e){

            System.err.println(e.getMessage());

        }

    }

}
