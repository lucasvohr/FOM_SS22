public class Uebung_8_5_Check {

    public void check(int input) throws Uebung_8_5_Fehler{

        if(input < 1000){

            throw new Uebung_8_5_Fehler();

        } else {
            
            System.out.println("Eingabe erlaubt...");

        }
        
    }

}
