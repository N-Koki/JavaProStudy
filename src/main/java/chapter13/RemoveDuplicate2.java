package chapter13;

public class RemoveDuplicate2 {

    public static void main(String[] args) {
        String data = "abccccbaabcc";

        char prev = 0;
        StringBuilder builder = new StringBuilder();
        for (char ch : data.toCharArray()) {
            if (ch == prev) {
                continue;
            }
            builder.append(ch);
            prev = ch;
        }

        String result = builder.toString();
        System.out.println(data);
        System.out.println(result);

    }
}
