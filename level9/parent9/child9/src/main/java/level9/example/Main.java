package level9.example;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Language level 9");
    }

    public static void factoryMethodsInCollection9_1(){
        List.of(1,2,3,4,5);
        Set.of(1,2,3,4,5);
    }
    public static void processApi9_2(){
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process Id: = " + currentProcess.pid());
    }

    public static void nameOfVariable9_5(){
        int _ = 23;
    }
}
