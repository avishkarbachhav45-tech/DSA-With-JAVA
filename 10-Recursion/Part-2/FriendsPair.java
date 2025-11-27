public class FriendsPair{

    public static int printPairs(int n){
        if(n == 1 || n == 2){
            return n;
        }

        // int fnm1 = printPairs(n-1);
        // int fnm2 = printPairs(n-2);
        // int pairWays = (n -1) * fnm2;

        // int totalWays = fnm1 + pairWays;
        // return totalWays;

        return printPairs(n-1) + (n-1) * printPairs(n-2);
    }
    public static void main(String[] args) {

        System.out.println(printPairs(3));
        
    }
}