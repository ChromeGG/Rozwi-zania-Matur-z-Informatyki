package zad_4_WEGA;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad_4_3 {
    public static void main(String[] args) {

        File sygnaly = new File(String.valueOf(Paths.get("Dane_PR2/sygnaly.txt")));
        Scanner inputScanner = null;

        try {
            inputScanner = new Scanner(sygnaly);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> words = new ArrayList<>();

        while (inputScanner.hasNextLine()) {

            String line;
            line = inputScanner.nextLine();
            char[] lineAsChars = line.toCharArray();

            boolean correctWord = true;

            for (char lineAsChar : lineAsChars) {
                for (char lineAsChar1 : lineAsChars) {

                    if (Math.abs((int) lineAsChar - (int) lineAsChar1) > 10) {
                        correctWord = false;
                        break;
                    }

                }
                if (!(correctWord)) {
                    break;
                }
            }

            if (correctWord) {
                words.add(line);
            }


        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}
