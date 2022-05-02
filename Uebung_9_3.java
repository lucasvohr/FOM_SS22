import static javax.swing.JOptionPane.*;
import java.io.File;
import java.io.IOException;

public class Uebung_9_3 {
    
    public static void main(String[] args){

        String pfad = "C:/temp/";
        String eingabe = showInputDialog("Geben Sie einen Dateinamen ein:");
        
        File datei = new File(pfad + eingabe);
       

        if(datei.exists() == false){

            try {

                boolean angelegt = datei.createNewFile();

                if(angelegt == true){

                    System.out.println("Datei wurde angelegt.");

                } else {

                    System.out.println("Datei existiert bereits.");

                }

            } catch (IOException e){

                System.out.println("Fehler bei Dateianlage: " + e.getMessage());
                e.printStackTrace();

            }

        } else {

            System.out.println("Die Datei existiert bereits.");

        }

        datei.setWritable(false);
        System.out.println("Datei kann bearbeitet werden:\t" + datei.canWrite());

        datei.setWritable(true);
        System.out.println("Datei kann bearbeitet werden:\t" + datei.canWrite());


    }

}
