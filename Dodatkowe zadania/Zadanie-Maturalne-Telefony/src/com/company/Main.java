package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("telefony.txt");
            Scanner sc = new Scanner(file);



//========================================================================================================================
//              ROZWIAZANIE A)
//            int timer = 0;
//
//
//            while (sc.hasNextLine()) {
//                if (sc.nextLine().equals("504669045")) {
//                    timer++;
//                }
//            }
//
//            System.out.println(timer); //30

//========================================================================================================================
//                  ROZWIAZANIE B)
//            List<String> listOfDuplicates = new ArrayList<>();
//
//            while (sc.hasNextLine()) {
//                listOfDuplicates.add(sc.nextLine());
//            }
//
//            System.out.println(listOfDuplicates);
//
//            Set<String> uniqueSet = new HashSet<String>(listOfDuplicates);
//            for (String temp : uniqueSet) {
//                if (Collections.frequency(listOfDuplicates, temp)> 10)
//                    System.out.println(temp + ": " + Collections.frequency(listOfDuplicates, temp));
//            }

            //49
//========================================================================================================================
//              ROZWIAZANIE C)
//            String line;
//            int timer = 0;
//
//            while (sc.hasNextLine()) {
//                line = sc.nextLine();
//                if (line.substring(0, 3).equals("511")) {
//                    System.out.println(line);
//                    timer++;
//                }
////                if(line.charAt(0) == '5' && line.charAt(1) == '1' && line.charAt(2) == '1') {
////                    System.out.println(line);
////                    timer++;
////                }
//
//            }
//            System.out.println(timer); //51
// ========================================================================================================================
//            ROZWIAZANIE D)
//
//            String line;
//            int timer = 0;
//
//
//            while (sc.hasNextLine()) {
//                line = sc.nextLine();
//                int i;
//                int temp2=0;
//                for (i = 0; i <= 8; i++) {
//                    int temp = Integer.parseInt(String.valueOf(Character.getNumericValue(line.charAt(i))));

//                    if (temp2 % 2 == 0) {
//                        temp2 += temp;
//                    }
//                }
//                if (temp2 >= 42) {
//                    timer++;
//                }
//            }
//
//            System.out.println(timer); //6
// ========================================================================================================================
//              ROZWIAZANIE E)
//            String line;
//            int timer = 0;
//
//            while (sc.hasNextLine()) {
//                line = sc.nextLine();
//                int i;
//                int temp2=0;
//                for (i = 0; i <= 8; i++) {
//                    int temp = Integer.parseInt(String.valueOf(Character.getNumericValue(line.charAt(i))));
//
//                    //temp = Integer.parseInt(String.valueOf(Character.getNumericValue(line.charAt(i))));
//                    if (temp == 1) {
//                        temp2++;
//                    }
//                }
//                if (temp2 >= 4) {
//                    timer++;
//                }
//
//            }
//
//            System.out.println(timer); //8
// ========================================================================================================================
//            ROZWIAZANIE F)
//            String line;
//            int timer = 0;
//
//            while (sc.hasNextLine()) {
//
//                line = sc.nextLine();
//                int sum = 0;
//                boolean check = false;
//                int mediana;
//                for (int i = 0; i <= 8; i++) {
//                    if (line.charAt(8) == '2') {
//                        check = true;
//                        int temp = Integer.parseInt(String.valueOf(Character.getNumericValue(line.charAt(i))));
//                        sum += temp;
//
//                    } else {
//                        break;
//                    }
//                }
//
//                if (check) {
//                    System.out.println(sum);
//                    mediana = sum / 9;
//
//                    if (mediana % 3 == 0) {
//                        timer++;
//                    }
//                }
//            }
//
//            System.out.println(timer);  //16
// ========================================================================================================================


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
