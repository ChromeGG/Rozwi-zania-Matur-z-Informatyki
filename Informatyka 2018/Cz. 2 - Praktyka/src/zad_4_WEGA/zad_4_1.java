package zad_4_WEGA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class zad_4_1 {
    public static void main(String[] args) {

        for (int i = 39; i <= 1000; i += 40) {
            String readLine = "";
            try {
                readLine = Files.readAllLines(Paths.get("Dane_PR2/sygnaly.txt")).get(i);

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(readLine.charAt(9));
            //ZAPISZODPOWIEDZIDOPLIKUTXT
        }

    }
}
