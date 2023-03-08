package child.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Language level 7");
    }

//    public static void stringInSwitch7_1(){
//        String browser = System.getProperty("browser", "CHROME");
//        switch (browser){
//            case "OPERA": break;
//            default:
//                System.out.println(browser);
//        }
//    }

//    public static void multipleExceptionTypes7_2(){
//        try{
//            int array[] = new int[10];
//            array[3] = 30/0;
//            array[11] = 12;
//        }
//        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//    }

//    public static void automaticResourcesManagemet7_3(){
//        try (BufferedReader reader  = new BufferedReader(new FileReader("text.txt"));
//             BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//                writer.write(line);
//                writer.newLine();
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

//    public static void diamondOperator7_4(){
//        List<String> lst2 = new ArrayList<>();
//    }
}