public class FunctionOverloading{
    //Function Overloading using Parameters

    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // public static void main(String[] args) {
    //     System.out.println(sum(8,10));
    //     System.out.println(sum(20,20,5));
    // }


    //Function overloading using Datatypes

    public static int sum(int a , int b){
        return a + b;
    }
    public static float sum(float a , float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(20,25));
        System.out.println(sum(9.5f,8.5f));
    }
}