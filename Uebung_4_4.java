import static javax.swing.JOptionPane.*;

public class Uebung_4_4 {
    
    static double pi = 3.14159265359;

    public static void main(String[] args){

        double flaeche = flaeche(Double.parseDouble(showInputDialog("Geben Sie den Radius an:")));
        System.out.println("Die Fläche des Kreises beträgt: " + flaeche);

    }

    public static double flaeche(double radius){

        double flaeche = radius * radius * pi;
        return flaeche;
        
    }
    
}
