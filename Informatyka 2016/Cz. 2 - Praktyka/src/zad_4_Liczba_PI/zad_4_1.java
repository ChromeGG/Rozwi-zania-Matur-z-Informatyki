package zad_4_Liczba_PI;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class zad_4_1 {
    public static void main(String[] args) {
//        System.out.println(123);
//
//        File file = new File(String.valueOf(Paths.get("/Dane_PR2/punkty.txt")));
//        Scanner input;
//
//        try{
//            input = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        int n = 730;
        int p = 1;
        int q = n;
        int s = 0;

        while (p < q) {
            s = (p + q) / 2;
            if (s * s * s < n) {
                p = s + 1;
            } else {
                q = s;
            }
        }

        System.out.println(p);

    }
}
