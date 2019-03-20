package zad_4_Liczby_binarne;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class zad_4_2 {

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {

        File file = new File(String.valueOf(Paths.get("Dane_PR2/liczby.txt")));
        Scanner inputScanner = null;

        try {
            inputScanner = new Scanner(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line;
        int divisibleBy2 = 0;
        int divisibleBy8 = 0;

        while (inputScanner.hasNextLine()) {
            line = inputScanner.nextLine();

            if (line.endsWith("0")) {
                divisibleBy2++;
            }
            if (line.endsWith("000")){
                divisibleBy8++;
            }
        }

        System.out.println(" Przez 2: " + divisibleBy2);
        System.out.println(" Przez 8: " + divisibleBy8);
    }
}
