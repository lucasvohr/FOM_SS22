public class Uebung_6_BeachVolleyball extends Uebung_6_Volleyball{
    
    private int ballgroesse;

    public Uebung_6_BeachVolleyball(String in_name, int in_anzahl_Spieler){
        
        super(in_name, in_anzahl_Spieler);
        ballgroesse = 4;

    }

    public void spielen(){

        System.out.println("Wir spielen " + name + " im Sand mit " + anzahl_spieler + " Spielern");

    }

    public void get_ballgroesse(){

        System.out.println("Die Ballgröße beträgt: " + ballgroesse);

    }

    public void set_ballgroesse(int groesse){

        if(groesse >= 1 & groesse < 6){
            ballgroesse = groesse;
            System.out.println("Die Ballgröße wurde auf " + ballgroesse + " geändert");
        } else {
            System.out.println("Es sind nur Ballgrößen [1-5] erlaubt.");
        }

    }

}
