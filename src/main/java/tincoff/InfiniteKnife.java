package tincoff;

import java.util.Scanner;

public class InfiniteKnife {

    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        int amountOfParts = scanner.nextInt();

        if (amountOfParts <= 9) {
            switch (amountOfParts) {
                case 1:
                    System.out.println(counter);
                    break;
                case 5, 6, 9, 8:
                    counter = counter + 3;
                    System.out.println(counter);
                    break;
                case 7:
                    counter = counter + 4;
                    System.out.println(counter);
                    break;
                case 3, 4:
                    counter = counter + 2;
                    System.out.println(counter);
                    break;
                case 2:
                    counter = counter + 1;
                    System.out.println(counter);
                    break;
            }
        } else if (amountOfParts % 2 == 0 && amountOfParts >= 10) {
            while (amountOfParts / 2 != 1) {
                if (amountOfParts % 2 != 0) {
                    amountOfParts = amountOfParts - 1;
                    counter++;
                }
                if (amountOfParts <= 9) {
                    switch (amountOfParts) {
                        case 5, 6, 9, 8:
                            counter = counter + 3;
                            break;
                        case 7:
                            counter = counter + 4;
                            break;
                        case 3, 4:
                            counter = counter + 2;
                            break;
                        case 2:
                            counter = counter + 1;
                            break;
                    }
                    break;
                }
                amountOfParts = amountOfParts / 2;
                counter++;
            }
            System.out.println(counter);
        }
    }
}