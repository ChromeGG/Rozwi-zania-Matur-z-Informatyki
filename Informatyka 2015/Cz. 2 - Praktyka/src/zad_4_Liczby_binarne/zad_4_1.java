package zad_4_Liczby_binarne;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class zad_4_1 {

    public static void main(String[] args) {

        File file = new File(String.valueOf(Paths.get("Dane_PR2/liczby.txt")));
        Scanner inputScanner = null;

        try {
            inputScanner = new Scanner(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String line = "";

        int timer = 0;
        int timer1 = 0;
        int timer2 = 0;

        while (inputScanner.hasNext()) {
            line = inputScanner.nextLine();

            char[] toCharArray = line.toCharArray();

            for (char number : toCharArray) {
                if (number == '1') {
                    timer1++;
                } else {
                    timer2++;
                }
            }

            if (timer2 > timer1) {
                timer++;
            }

            timer1 = 0;
            timer2 = 0;
        }

        System.out.println(timer);

    }
}
