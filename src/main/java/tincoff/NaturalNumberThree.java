package tincoff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NaturalNumberThree {

    static String cost1 = "11";
    static String cost2 = "22";
    static String cost3 = "33";
    static String cost4 = "44";
    static String cost5 = "55";
    static String cost6 = "66";
    static String cost7 = "77";
    static String cost8 = "88";
    static String cost9 = "99";
    static int counter = 0;

    public static void countWhereFinishEqualStart(long inputStart, long inputFinish, long counter){
        if(inputFinish == inputStart ){
            String str = String.valueOf(inputFinish);
            String[] split = str.split("");
            if(Arrays.stream(split).allMatch(s -> s.equals( split[0]))){
                counter++;
                System.out.println(counter);
            }else {
                System.out.println(counter);
            }
        }else {
            System.out.println(counter);
        }
    }


    public static void countBeforeTen(long inputStart, long inputFinish, long counter) {
        long inputStartCounter = inputStart;
        while (inputStartCounter <= inputFinish) {
            NaturalNumberThree.counter++;
            inputStartCounter++;
        }
    }

    public static void countBeforeTenWhereInputFinishMoreThanNine(long inputStart, long inputFinish, long counter) {
        long inputStartCounter = inputStart;
        while (inputStartCounter <= 9) {
            NaturalNumberThree.counter++;
            inputStartCounter++;
        }
    }

    public static void countAfterTen(long inputStart, long inputFinish, long counter) {
        for (long i = 0; i <= 16L; i++) {
            if (Long.parseLong(cost1) <= inputFinish && Long.parseLong(cost1) >= inputStart) {
                NaturalNumberThree.counter++;
            }  if (i<16){
                  cost1 = cost1 + 1;} else {};
            if (Long.parseLong(cost2) <= inputFinish && Long.parseLong(cost2) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                  cost2 = cost2 + 2;} else {};
            if (Long.parseLong(cost3) <= inputFinish && Long.parseLong(cost3) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                cost3 = cost3 + 3;} else {};
            //cost3 = cost3 + 3;
            if (Long.parseLong(cost4) <= inputFinish && Long.parseLong(cost4) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                cost4 = cost4 + 4;} else {};
            //cost4 = cost4 + 4;
            if (Long.parseLong(cost5) <= inputFinish && Long.parseLong(cost5) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                cost5 = cost5 + 5;} else {};
            //cost5 = cost5 + 5;
            if (Long.parseLong(cost6) <= inputFinish && Long.parseLong(cost6) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                cost6 = cost6 + 6;} else {};
            //cost6 = cost6 + 6;
            if (Long.parseLong(cost7) <= inputFinish && Long.parseLong(cost7) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                cost7 = cost7 + 7;} else {};
            //cost7 = cost7 + 7;
            if (Long.parseLong(cost8) <= inputFinish && Long.parseLong(cost8) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                cost8 = cost8 + 8;} else {};
            //cost8 = cost8 + 8;
            if (Long.parseLong(cost9) <= inputFinish && Long.parseLong(cost9) >= inputStart) {
                NaturalNumberThree.counter++;
            } if (i<16){
                cost9 = cost9 + 9;} else {};
            //cost9 = cost9 + 9;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] scannerString = scanner.nextLine().split("\\s");
        long inputStart = Long.parseLong(scannerString[0]);
        long inputFinish = Long.parseLong(scannerString[1]);
        List<Long> outPut = new ArrayList<>();

        if (inputFinish == inputStart){
            countWhereFinishEqualStart(inputStart,inputFinish,counter);

        }

        if (inputStart > 0 && inputStart <= 9 && inputFinish <= 9 && inputFinish!=inputStart ) {
            countBeforeTen(inputStart, inputFinish, counter);
            System.out.println(NaturalNumberThree.counter);
        }

        if (inputStart > 0 && inputStart <= 9 && inputFinish > 9) {
            //countBeforeTen(inputStart,inputFinish,NaturalNumberThree.counter);
            countBeforeTenWhereInputFinishMoreThanNine(inputStart, inputFinish, NaturalNumberThree.counter);
            countAfterTen(inputStart, inputFinish, NaturalNumberThree.counter);
            System.out.println(NaturalNumberThree.counter);
        }

        if (inputStart > 9 && inputFinish > inputStart) {
            countAfterTen(inputStart, inputFinish, NaturalNumberThree.counter);
            System.out.println(NaturalNumberThree.counter);
        }


    }
}
