public class ClassObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Orange");
        System.out.println(p1.color);
        p1.setTip(45);
        System.out.println(p1.tip);

        p1.color = "blue";
        System.out.println(p1.color);

    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPerc(int phy, int chem, int math){
        percentage = (phy + chem +math) / 3;
    }
}
