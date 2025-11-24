public class HierachicalInheritance {
    public static void main(String[] args) {
        
        Wild lion = new Wild();

        lion.eat();
        lion.breathe();
        
        Pet billa = new Pet();

        billa.breathe();
        billa.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Pet extends Animal{
    int ears;

    void walk(){
        System.out.println("Walks");
    }
}

class Wild extends Animal{

    void live(){
        System.out.println("In jungle");
    }

}
