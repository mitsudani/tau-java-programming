package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]) throws IOException {

        //createNewFile();
        //numbersExpectionHandling();
        createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void numbersExpectionHandling() {
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        // Exception (top level exception) must be at the end, otherwise it will throw an error
        // catch (Exception e) {
        //    e.printStackTrace();
        // }
        } finally {
            fileReader.close();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

}
