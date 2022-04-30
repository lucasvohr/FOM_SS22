public class Uebung_8_6_Check {

    private String password = "passwort123"; 
    
    public boolean login(String input) throws Uebung_8_6_Fehler{

        if(input.equals(password)){

            System.out.println("Passwort-Eingabe war korrekt.");
            return true;

        } else {

            throw new Uebung_8_6_Fehler();
            

        }

    }

}
