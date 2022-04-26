public class Uebung_8_4_Fehlerpruefung {
    
    public void pruefen(int eingabe) throws Uebung_8_4_Fehlermeldung{
        
        if(eingabe < 0){

            throw new Uebung_8_4_Fehlermeldung();
            
        }
    }

}
