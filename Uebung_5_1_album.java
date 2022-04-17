public class Uebung_5_1_album {
    
    private String interpret;
    private String album_titel;
    private String medium;
    private int release;
    private int num_tracks;

    public Uebung_5_1_album(String in_interpret, String in_titel, String in_medium, int in_release, int in_num_tracks){

        interpret = in_interpret;
        album_titel = in_titel;
        medium = in_medium;
        release = in_release;
        num_tracks = in_num_tracks;

    } 

    public void set_interpret(String input){
            
        interpret = input;

    }

    public void set_titel(String input){
            
        album_titel = input;

    }

    public void set_medium(String input){
            
        medium = input;

    }

    public void set_release(int input){
            
        release = input;

    }

    public void set_num_tracks(int input){
            
        num_tracks = input;

    }

    public void ausgabe(){

        System.out.println("Interpret: \t\t" + interpret);
        System.out.println("Album: \t\t\t" + album_titel);
        System.out.println("Medium: \t\t" + medium);
        System.out.println("Veröffentlichung: \t" + release);
        System.out.println("Tracks: \t\t" + num_tracks);
        System.out.println("-------------------------------------------");

    }

}
