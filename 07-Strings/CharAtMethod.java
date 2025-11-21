public class CharAtMethod {

    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + "   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        



        // For a single letter
        // String player = "Rohit Sharma";
        // System.out.println(player.charAt(0));


        String player = "Rohit Sharma";
        printLetter(player);
    }
}
