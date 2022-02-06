import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class SelectWord {


    try {
        File file = new File("slowa.txt");
        int index=0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
                    index++;
                    Random random = new Random();
                    int word = random.nextInt(index);
                    System.out.println(index);
                }
            }catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

}

