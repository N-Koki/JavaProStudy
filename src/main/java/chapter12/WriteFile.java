package chapter12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        String message = """
                          test
                          message
                         """;

        // Pathでファイル名を指定。ここでは、「test.txt」というファイル名にしている。プロジェクトのルートパスにファイルができる。(pom.xmlと同じ階層）
        Path p = Path.of("test.txt");

        // ファイルに文字列を保存。　第一引数：保存位置、第二引数：書き込む文字列
        Files.writeString(p, message);
    }
}
