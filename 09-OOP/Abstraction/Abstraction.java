public class Abstraction {
    public static void main(String[] args) {
        
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);
    }
}

abstract class Animal{

    String color;

    Animal(){
        color = "Brown";
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();

}

class Horse extends Animal{

    void changeColor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{

    void changeColor(){
        color = "White";
    }

    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}