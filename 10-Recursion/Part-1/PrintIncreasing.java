public class PrintIncreasing {
    public static void printIncr(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printIncr(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printIncr(n);
    }
}
