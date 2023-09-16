package chapter14;

public class ClassSample1 {

    record Student(String name,int score) {}

    public static void main(String[] args) {
        Student s = new Student("kis", 89);
        System.out.println(s);
    }
}
