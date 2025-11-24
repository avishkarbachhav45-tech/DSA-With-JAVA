public class MethodOverriding {
    public static void main(String[] args) {
        

        Cow c = new Cow();
        c.eat();
    }
}


class Animal{
    void eat(){
        System.out.println("Eats everything");
    }
}

class Cow extends Animal{

    void eat(){

        System.out.println("Eats only grass");
    }
}