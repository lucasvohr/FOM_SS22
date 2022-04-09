public class Übung_6_MAIN {
 
    public static void main(String[] args){

        // Objekt anlegen
            Übung_6_Sportart sport = new Übung_6_Sportart("Tischtennis");
            sport.spielen();
            System.out.println("\n\nNächstes Methode:\n");

        // Objekt der Unterklasse definieren und initialisieren
            Übung_6_Badminton badminton = new Übung_6_Badminton("Badminton", 170);
            badminton.spielen();
            System.out.println(", das Netz ist " + badminton.netzhoehe + " cm hoch");

    }

}
