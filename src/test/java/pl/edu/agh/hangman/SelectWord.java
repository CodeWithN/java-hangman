package pl.edu.agh.hangman;


import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class SelectWord {


    public static void main(String[] args) {
        new SelectWord().selectWord();
        System.out.println(new SelectWord().selectWord());
    }
    public String selectWord() {

        File f = new File("src/main/resources/slowa.txt");

        try (Scanner scanner = new Scanner(f)) {
            int index = new Random().nextInt(1600);

            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                i++;
                if (i == index) {
                    return line;
                }
            }

        } catch (Exception ex) {
            System.out.println();

        } return "";
    }
}