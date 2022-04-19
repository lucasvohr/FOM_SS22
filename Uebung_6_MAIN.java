public class Uebung_6_MAIN {
 
    public static void main(String[] args){

    // Übung 6.1
        // Objekt anlegen
            Uebung_6_Sportart sport = new Uebung_6_Sportart("Tischtennis");
            sport.spielen();
            System.out.println("\n\nNächste Methode:\n");

    // Übung 6.2
        // Objekt der Unterklasse definieren und initialisieren
            Uebung_6_Badminton badminton = new Uebung_6_Badminton("Badminton", 170);
            badminton.spielen();
            System.out.println(", das Netz ist " + badminton.netzhoehe + " cm hoch");

    // Übung 6.3
        // Volleyball-Klasse aufrufen und Methode "spielen()" aufrufen
            Uebung_6_Volleyball volleyball = new Uebung_6_Volleyball("Volleyball", 4);
            volleyball.spielen();

    // Übung 6.4
        // Beachvolleyball-Klasse aufrufen und Methode "spielen()" aufrufen
            Uebung_6_BeachVolleyball beachVolleyball = new Uebung_6_BeachVolleyball("Volleyball", 4);
            beachVolleyball.spielen();
            System.out.println("Die Ballgröße beträgt: " + beachVolleyball.get_ballgroesse());
            beachVolleyball.set_ballgroesse(3);
            System.out.println("Die Ballgröße beträgt: " + beachVolleyball.get_ballgroesse());
    }

}
