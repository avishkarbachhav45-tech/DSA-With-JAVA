public class ParameterizedConstructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Avi");
        Student s3 = new Student("45");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class Student {
    String name;
    int roll;

    Student(){
        System.out.println();
    }

    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}