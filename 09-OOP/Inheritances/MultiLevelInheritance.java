public class MultiLevelInheritance {
    public static void main(String[] args) {
        
        Cat billa = new Cat();

        billa.eat();
        billa.breathe();
        billa.ears = 2;
        billa.walk();;
        System.out.println(billa.ears);
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

class Cat extends Pet{

    int legs;

}
