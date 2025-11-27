public class PrintBinStrings {

    public static void printBin(int n, int lastPlace, String str){

        if(n == 0){
            System.out.println(str);
            return;
        }

        printBin(n-1, 0, str+"0");

        if(lastPlace == 0){
            printBin(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBin(3, 0, "");
    }
}
