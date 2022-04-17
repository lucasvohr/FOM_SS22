public class Uebung_6_Volleyball extends Uebung_6_Sportart{
    
    protected int anzahl_spieler;

    public Uebung_6_Volleyball(String in_name, int anz_Spieler){

        super(in_name);
        anzahl_spieler = anz_Spieler;

    }

    public void spielen(){

        System.out.println("Wir spielen " + name + " mit " + anzahl_spieler + " Spielern");

    }

}
