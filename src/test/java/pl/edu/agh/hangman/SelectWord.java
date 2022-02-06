package pl.edu.agh.hangman;


import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class SelectWord {


    private void selectWord() {

        File f = new File("resources/slowa.txt");
        try (Scanner scanner = new Scanner(f)) {
            String word = scanner.next();

        } catch (Exception ex) {
            System.out.println("INFO No valid conf data");
        }
    }
}