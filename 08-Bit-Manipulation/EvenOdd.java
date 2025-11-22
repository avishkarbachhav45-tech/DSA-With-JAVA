public class EvenOdd {

    public static void evenOddReturns(int n){
        int bitMask = 1;

        if((n & bitMask) == 0){
            System.out.println("No is even");
        }
        else{
            System.out.println("no is odd");
        }
    }

    public static void main(String[] args) {
        evenOddReturns(5);
        evenOddReturns(4);
        evenOddReturns(8);
        evenOddReturns(45);
        evenOddReturns(454);
        evenOddReturns(46545646);
        evenOddReturns(1841218);
        evenOddReturns(215489421);
    }
}
