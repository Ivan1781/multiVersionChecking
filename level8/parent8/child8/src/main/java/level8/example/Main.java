package level8.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Language level 8");
    }

    public static void lambdaExpressions8_1() {
        Runnable e = () -> {
            System.out.println("Hello");
        };
    }

    public static void streamApi8_2() {
        list.stream();
    }

    public static void optional8_3(){
        Optional<String> optional = Optional.empty();
    }

    public static void methodReference8_4(){
        System.out::println;
    }
}