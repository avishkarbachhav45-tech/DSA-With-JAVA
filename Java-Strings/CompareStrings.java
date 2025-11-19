public class CompareStrings {
    public static void main(String[] args) {
        
        String S1  = "Avi";
        String S2  = "Avi";
        String S3  = new String("Avi");

        if(S1 == S2){
            System.out.println("Strings are eual");
        }
        else{
            System.out.println("Strings are not equal");
        }


        if(S1 == S3){
            System.out.println("Strings are eual");
        }
        else{
            System.out.println("Strings are not equal");
        }


        if(S1.equals(S3)){
            System.out.println("Strings are eual");
        }
        else{
            System.out.println("Strings are not equal");
        }

    }
}
