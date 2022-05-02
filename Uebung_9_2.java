import static javax.swing.JOptionPane.*;
import java.io.File;
import java.io.IOException;

public class Uebung_9_2 {
    
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

        System.out.println("Ermitteln Sie bitte folgende Eigentschafte:");
        System.out.println("1. den absoluten Pfad: " + datei.getAbsolutePath());
        System.out.println("2. ist eine Datei: " + datei.isFile());
        System.out.println("3. den gesamten Speicher, der auf der Festplatte verfügbar ist: " + datei.getTotalSpace() + " Bytes");
        System.out.println("4. den gesamten Speicher, der noch frei ist: " + datei.getFreeSpace() + " Bytes");
        System.out.println("5. den gesamten Speicher, der noch zur Nutzung frei ist: " + datei.getUsableSpace() + " Bytes");

        datei.delete();
            System.out.println("6. nach dem Löschen der Datei, den Status: " + datei.isFile());


    }

}
