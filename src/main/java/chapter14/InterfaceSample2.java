package chapter14;

import java.util.List;

public class InterfaceSample2 {
    interface Named {
        String name();
    }
    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named {}

    public static void main(String[] args) {
        List<Named> people = List.of(new Student("kis", 80), new Teacher("hosoya", "Math"));

        for (Named p : people) {
            String n = p.name();
            System.out.println("こんにちは%sさん".formatted(n));
        }
    }


}
