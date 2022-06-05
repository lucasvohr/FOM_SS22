import javax.swing.*;
import java.awt.*;

public class Uebung_10_Herzfrequenz extends Canvas {
    
    public static void main(String[] args){

        JFrame frame = new JFrame("Herzfrequenzrechner");
            frame.setSize(200, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLayout(new FlowLayout());

        JTextField eingabefeld = new JTextField();
            eingabefeld.setHorizontalAlignment(0);
        
        JLabel label_oben = new JLabel("Geben Sie bitte Ihr Alter ein:");
        JLabel label_mitte = new JLabel("Wählen Sie bitte aus:");

        JRadioButton radiobutton_mann = new JRadioButton("Mann");
        JRadioButton radiobutton_frau = new JRadioButton("Frau");

        JButton button_berechnen = new JButton("Berechnen");
        JButton button_beenden = new JButton("Beenden");

        
            frame.add(label_oben);
            frame.add(eingabefeld);
            frame.add(label_mitte);

            JPanel panel_mitte = new JPanel();
                panel_mitte.setVisible(true);
                panel_mitte.setLayout(new BorderLayout(2,2));
                    panel_mitte.add(radiobutton_mann);
                    panel_mitte.add(radiobutton_frau);
                    panel_mitte.add(button_berechnen);
                    panel_mitte.add(button_beenden);
            
            frame.add(panel_mitte);

    }

}
