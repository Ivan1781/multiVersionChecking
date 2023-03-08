package child12.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Language level 12");
    }

    public static void newMethodsString12_1(){
        String text = "Hello";
        text = text.indent(4);

        String transformed = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
    }

    public static void mismatchFiles12_2() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12");
        Files.writeString(filePath2, "Java 12");
        long mismatch = Files.mismatch(filePath1, filePath2);
    }

    public static void teeingCollectors12_3(){
        Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
    }
}