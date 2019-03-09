package zad_5_zbiornik;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        File file = new File(String.valueOf(Paths.get("Dane_PR2/sygnaly.txt")));
        Scanner inputScanner = null;

        try {
            inputScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Set<Character> uniqueCharsSet = new HashSet<>();
        Set<Character> bufferForUniqueCharsSet = new HashSet<>();

        String longestWord = null;

        //assert inputScanner != null;
        while (inputScanner.hasNextLine()) {
            String line;
            line = inputScanner.nextLine();

            bufferForUniqueCharsSet.clear();
            for (Character bufferUniqueChar : line.toCharArray()) {
                bufferForUniqueCharsSet.add(bufferUniqueChar);
            }

            if (bufferForUniqueCharsSet.size() > uniqueCharsSet.size()) {
                longestWord = line;
                uniqueCharsSet.clear();
                for (Character uniqueChar : line.toCharArray()) {
                    uniqueCharsSet.add(uniqueChar);
                }
            }
        }

        System.out.println(uniqueCharsSet.size()); //26
        System.out.println(longestWord); //SUOLDQWISCDRFLRWHZBNTMIAPHALMNCWHVGMXOZSQNXWXSFELZVTUTILXWKCTYBQYSUAKNYJKRXDJQYHXAQGWN

    }
}
