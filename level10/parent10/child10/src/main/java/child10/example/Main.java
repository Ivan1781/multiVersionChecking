package child10.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void localVariableTypeInference10_1() {
        var number = 23;
    }

    public static void copyOfCollection10_2(){
        List<Integer> copyList = List.copyOf(List.of(1,2,3,4));
        copyList.add(4);
    }

    public static void toUnmodifiable10_3(){
        Stream.of(1,2,3)
                .collect(Collectors.toUnmodifiableList());
    }

    public static void orElseThrowOptional10_4(){
        Stream.of(1,2,3).findFirst().orElseThrow();
    }

}

