package pl.edu.agh.hangman;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class SelectWord {


    File file = new File("slowa.txt");
    int index=0;

    try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
                    index++;
                    Random random = new Random();
                    int w = random.nextInt(index);
                    System.out.println(index);
        }

    } catch
}

