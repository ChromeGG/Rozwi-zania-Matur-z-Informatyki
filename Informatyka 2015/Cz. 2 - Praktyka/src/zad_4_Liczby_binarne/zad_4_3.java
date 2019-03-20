package zad_4_Liczby_binarne;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class zad_4_3 {

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
        String smallest;

        while (inputScanner.hasNextLine()){
            line = inputScanner.nextLine();



        }

    }
}
