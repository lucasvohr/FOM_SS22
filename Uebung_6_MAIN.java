public class Uebung_6_MAIN {
 
    public static void main(String[] args){

        // Objekt anlegen
            Uebung_6_Sportart sport = new Uebung_6_Sportart("Tischtennis");
            sport.spielen();
            System.out.println("\n\nNächste Methode:\n");

        // Objekt der Unterklasse definieren und initialisieren
            Uebung_6_Badminton badminton = new Uebung_6_Badminton("Badminton", 170);
            badminton.spielen();
            System.out.println(", das Netz ist " + badminton.netzhoehe + " cm hoch");

    }

}
