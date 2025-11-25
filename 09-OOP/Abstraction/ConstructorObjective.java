public class ConstructorObjective {
    public static void main(String[] args) {
        
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);

        Mustang m = new Mustang();
        m.eat();
    }
}

abstract class Animal{

    String color;

    Animal(){
        System.out.println("Animal constructor called");
        // color = "Brown";
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();

}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }

    void changeColor(){
        color = "Dark Brown";
    }

    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
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