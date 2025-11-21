public class SubString {

    public static String printSubString(String str, int si, int ei){

        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {

        String str = "RohitSharma";
        System.out.println(printSubString(str, 0, 5));

        // This is an Inbuilt function for SubString
        // String str = "RohitSharma";
        // System.out.println(str.substring(0,5 ));
    }
}
