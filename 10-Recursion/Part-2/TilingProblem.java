public class TilingProblem{

    public static int printWays(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        // int fnm1 = printWays(n-1);
        // int fnm2 = printWays(n-2);
        // int totalWays = fnm1 + fnm2;

        // return totalWays;

        return printWays(n-1) + printWays(n-2);
    }
    public static void main(String[] args) {

        System.out.println(printWays(5));
        
    }
}