package chapter14;

import java.util.List;

public class InterfaceSample1 {
    record Student(String name, int score) {}
    record Teacher(String name, String subject) {}

    public static void main(String[] args) {
        List<Record> people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"));

        for (Record p : people) {
            // RecordがStudent型かTeacher型か確認している
            String n = p instanceof Student s ? s.name :
                    p instanceof  Teacher t ? t.name() :
                            "---";
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }
}
