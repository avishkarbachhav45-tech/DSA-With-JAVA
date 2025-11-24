public class HybridInheritance {
    public static void main(String[] args) {
        
        Cat billa = new Cat();
        billa.color = "Orange";
        billa.breathe();
        billa.eat();
        billa.ears = 2;
        billa.walk();
        System.out.println(billa.color + "  "  + billa.ears);


        Parrot greenwala = new Parrot();
        greenwala.color = "Green";
        greenwala.breathe();
        greenwala.eat();
        greenwala.tails = 1;
        greenwala.fly();
        System.out.println(greenwala.color + "  "  + greenwala.tails);


        Tiger bangali = new Tiger();
        bangali.color = "Black and Yellow";
        bangali.breathe();
        bangali.eat();
        bangali.hunt = 5;
        bangali.live();
        System.out.println(bangali.color + "  "  + bangali.hunt);
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
    void food(){
        System.out.println("Catfood");
    }
}

class Dog extends Pet{
    void house(){
        System.out.println("doghouse");
    }
}


class Birds extends Animal{

    void fly(){
        System.out.println("flys");
    }
}

class Parrot extends Birds{

    int tails;
}


class Wild extends Animal{

    int hunt;
    
    void live(){
        System.out.println("In jungle");
    }

}

class Lion extends Wild{
    
}

class Tiger extends Wild{
    
}