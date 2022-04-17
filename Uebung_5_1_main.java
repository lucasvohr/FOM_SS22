public class Uebung_5_1_main {
    
    public static void main(String[] args){

            System.out.println("-------------------------------------------");

        // Objekt anlegen und erste Ausgabe
            Uebung_5_1_album testalbum = new Uebung_5_1_album("Prinz Pi", "Kompass ohne Norden", "CD", 2013, 15);
            testalbum.ausgabe();
            
        // Testweise die Einträge ändern:
            testalbum.set_interpret("Edgar Wasser");
            testalbum.set_medium("Stream (Spotify)");
            testalbum.set_titel("wtf irl");
            testalbum.set_release(2022);
            testalbum.ausgabe();
            
    }

}
