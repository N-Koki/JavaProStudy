package chapter14;

import java.util.Objects;

public class ClassSample2 {

    static final class Student {
        private final String name;
        private final int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String name() {
            return name;
        }

        public int score() {
            return score;
        }

        /**
         * equalsをオーバーライドして、Studentクラスのnameとscoreが同じかを比較している
         * https://qiita.com/yachinco/items/b1a3602d6aa261f5f7c4
         * @param obj
         * @return
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true; //引数のオブジェクトがこのオブジェクト自身であった場合 true
            if (obj == null || obj.getClass() != this.getClass()) return false; //引数のオブジェクトが、Studentクラスのオブジェクトではない場合はfalse
            Student that = (Student) obj;
            return Objects.equals(this.name, that.name) &&
                    this.score == that.score;  // フィールドの値が一致する場合は、true
        }

        /**
         * https://qiita.com/yachinco/items/b1a3602d6aa261f5f7c4
         * equalsメソッドを実装した場合は、hahsCodeメソッドも実装する必要がある
         * equalsメソッドの結果がtrueとなるオブジェクトは、hashCodeメソッドで同じ値を返す必要がある
         * ここでは、フィールドのnameとscoreをもとに、ハッシュコードを生成しているため、同じ値になる
         *
         * @return
         */
        @Override
        public int hashCode() {
            return Objects.hash(name, score);
        }


        /**
         * System.out.printlnで出力される内容を実装
         * @return
         */
        @Override
        public String toString() {
            return "String[" +
                    "name=" + name + ", " +
                    "score=" + score + ']';
        }
    }

    public static void main(String[] args) {
        Student s = new Student("kis", 89);
        System.out.println(s);
    }
}
