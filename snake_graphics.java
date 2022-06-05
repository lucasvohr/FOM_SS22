import java.awt.*;
import java.util.concurrent.TimeUnit;

public class snake_graphics extends Canvas{
    
    // Definition der Grundfläche
        int breite = 0;
        int hoehe = 0;
    
    // Festlegung Gewinnzone
        int win_x = 50;
        int win_y = 50;
        int win_groesse = 50;

    public snake_graphics(int breite_in, int hoehe_in){

        // Passt die Grundfläche an die Gegebenheiten des Hauptprogramms an
            breite = breite_in;
            hoehe = hoehe_in;

    }


    public void paint(Graphics g){

        // Spielfläche anlegen
            g.setColor(Color.BLACK);
            g.drawRect(1, 1, breite, hoehe);

        // Gewinnzone anlegen
            g.setColor(Color.GREEN);
            g.fillRect(win_x, win_y, win_groesse, win_groesse);

        // Start-Koordinaten festlegen
            int snake_groesse = 10;
            int snake_x = (int) (Math.random() * breite);
                int snake_x_old = snake_x;
            int snake_y = (int) (Math.random() * hoehe);
                int snake_y_old = snake_y;
            
            g.setColor(Color.RED);
            g.fillOval(snake_x, snake_y, snake_groesse, snake_groesse);

        // "Spielengine"
            boolean gewonnen = false;
            boolean verloren = false; 
            int richtung = 0;   
        
            while(gewonnen == false & verloren == false){

                // Nächsten Schritt prüfen
                    richtung = (int) Math.random() * 4 + 1;

                    snake_x_old = snake_x;
                    snake_y_old = snake_y;

                    switch(richtung){
                        case 1: snake_x =+ snake_groesse; break;    // nach oben
                        case 2: snake_y =+ snake_groesse; break;    // nach rechts
                        case 3: snake_x =- snake_groesse; break;    // nach unten
                        case 4: snake_y =- snake_groesse;           // nach links
                    }

                    if(snake_x == snake_x_old || snake_y == snake_y_old){

                        break;

                    }

                    
                // Prüfen ob neue Koordinaten außerhalb der Spielfläche liegt
                    if(snake_x <= (win_x + win_groesse) & snake_x > win_x){
                        if(snake_y <= (win_y + win_groesse) & snake_y > win_y){
                            gewonnen = true;
                        }
                    }

                    
                // Prüfen ob neue Koordinaten an Gewinnzone grenzen

                System.out.println("Koordinaten Snake:\t X= " + snake_x + "\t Y=" + snake_y);
                g.fillOval(snake_x, snake_y, snake_groesse, snake_groesse);
            }

    }

}
