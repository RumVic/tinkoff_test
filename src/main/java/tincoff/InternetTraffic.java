package tincoff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InternetTraffic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        int counter = 0;

        while (counter==0) {
            String[] strings = (scanner.nextLine().split("\\s"));
            list = Arrays.stream(strings).toList();
            counter++;
        }

        for (String s : list ) {
            inputList.add(Integer.parseInt(s));
        }

        if (inputList.get(1) >= inputList.get(3)) {
            System.out.println(inputList.get(0));
        } else if (inputList.get(1) < inputList.get(3)) {
            System.out.println(inputList.get(0) + ((inputList.get(3) - inputList.get(1)) * inputList.get(2)));
        }


    }
}
