package pl.edu.agh.hangman;
import java.util.Random;
import java.util.Scanner;


public class Hangman {
    public static void main(String[] args) {
        String[] words = {"DYNAMO", "ulewa", "Nagoya"};
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int failCounter = 0;
        String word = words[random.nextInt(words.length)];
        String guessWord = word;
        System.out.println("secret guess word is: " + word);

        System.out.println("Start of the game! ");

        String guess = "";
        for (int j = 0; j < guessWord.length(); j++) {
            guess = guess +"-";
        }
        System.out.println("You need to guess: "+ guess);


        while (failCounter <= 7) {

            System.out.println("Enter the char: ");
            String value =scan.nextLine();

            if (guessWord.contains( value)){
                System.out.println("good guess");


            }else{
                System.out.println("Next wrong guess..");
                failCounter++;
                System.out.println(HANGMANPICS[failCounter]);

            }

        }
    }


        public static final String[] HANGMANPICS = new String[]{
                "  +---+\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========",
                "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========",
                "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========",
                "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========",
                "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========",
                "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " /    |\n" +
                        "      |\n" +
                        "=========",
                "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "========"
        };


}
