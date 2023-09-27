package chapter14;

import java.util.List;
import java.util.function.Function;

public class InterfaceSample4 {
    @FunctionalInterface
    interface Named {
        String name();

        default String greeting() { return "こんにちは%sさん".formatted(name()); }
    }
    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named {}

    static class Passenger implements Named {
        @Override
        public String name() { return "通りすがり"; }
    }

    public static void main(String[] args) {
        List<Named> people = List.of(
                new Student("kis", 80),
                new Teacher("hosoya", "Math"),
                new Passenger());

        for (Named p : people) {
            String n = p.name();
            System.out.println("こんにちは%sさん".formatted(n));
        }
        message(() -> "no name");
        message(new Student("kis", 80));

        Function<String, String> greeting = s -> "こんにちは%sさん".formatted(s);
        String s = greeting.apply("kis");
        System.out.println(s);
    }

    static void message(Named named) { System.out.println("Hello " + named.name()); }
}
