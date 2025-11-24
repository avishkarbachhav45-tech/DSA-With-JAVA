public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(30,15));
        System.out.println(calc.sum(29.5f,15.5f));
        System.out.println(calc.sum(25,15, 5));
    }
}

class Calculator{

    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b,int c){
        return a + b + c;
    }
}
