public class NthFibonacci {

    public static int printFib(int n){

        if(n == 0 || n == 1){
            return n;
        }

        int fib1 = printFib(n-1);
        int fib2 = printFib(n-2);
        int fibn = fib1 + fib2;
        return fibn;
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(printFib(n));
        System.out.println(printFib(1));
        System.out.println(printFib(3));
        System.out.println(printFib(5));
        System.out.println(printFib(8));
        System.out.println(printFib(10));
        System.out.println(printFib(20));
        System.out.println(printFib(30));
    }
}