public class LogicalOperators {
    public static void main(String[] args) {

        int a = 4;
        int b = 2;
        int x = 5;
        int y = 0;

        //Logiacal AND &&
        System.out.println( ( a > b ) && ( x > y ));
        System.out.println( ( a < b ) && ( x > y ));
        System.out.println( ( a > b ) && ( x < y ));
        System.out.println( ( a < b ) && ( x < y ));

        //Logiacal OR ||
        System.out.println( ( a > b ) || ( x > y ));
        System.out.println( ( a < b ) || ( x > y ));
        System.out.println( ( a > b ) || ( x < y));
        System.out.println( ( a < b ) || ( x < y ));

        //Logical NOT
        System.out.println( ! ( 4 < 2 ));
    }
}
