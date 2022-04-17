public class Uebung_6_Sportart {
    
    // "protected", damit in der Unterklasse auf dieses Feld zugegriffen werden kann
        protected String name;

        public Uebung_6_Sportart(String in_name){
            name = in_name;
        }

        public void spielen(){
            System.out.print("Wir spielen: " + name);
        }

}
