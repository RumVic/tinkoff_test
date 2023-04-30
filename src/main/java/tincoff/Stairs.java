package tincoff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Stairs {
    //#TEST
    public static void fromFirsFloorToLastFloor(List<Integer> numberOfFloors, int positionOfEmployerOnFloor, int minAmountOfOperation) {

        int finishFloor = numberOfFloors.get(numberOfFloors.size() - 1);
        int startFloor = numberOfFloors.get(0);


        while (startFloor != finishFloor) {
            startFloor++;
            minAmountOfOperation++;
        }
        System.out.println(minAmountOfOperation);
    }

    public static void fromLastFloorToFirstFloor(List<Integer> numberOfFloors, int positionOfEmployerOnFloor, int minAmountOfOperation) {

        int finishFloor = numberOfFloors.get(0);
        int startFloor = numberOfFloors.get(numberOfFloors.size()-1);

        while (startFloor != finishFloor) {
            startFloor--;
            minAmountOfOperation++;
        }
        System.out.println(minAmountOfOperation);
    }

    public static void fromMiddleToUpThenToDown
            (List<Integer> numberOfFloors, int positionOfEmployerOnFloor, int minAmountOfOperation) {

        int startFloor = numberOfFloors.get(positionOfEmployerOnFloor - 1);
        int finishFloor = numberOfFloors.get(numberOfFloors.size() - 1);
        int firstFloor = numberOfFloors.get(0);



        while (startFloor != finishFloor) {
            startFloor++;
            minAmountOfOperation++;
        }
        while (startFloor != firstFloor) {
            startFloor--;
            minAmountOfOperation++;
        }
        System.out.println(minAmountOfOperation);
    }

    public static void fromMiddleToDownThenToUp(List<Integer> numberOfFloors, int positionOfEmployerOnFloor, int minAmountOfOperation) {

        int lastFloor = numberOfFloors.get(numberOfFloors.size() - 1);
        int firstFloor = numberOfFloors.get(0);
        int startFloor = numberOfFloors.get(positionOfEmployerOnFloor - 1);

        while (startFloor != firstFloor) {
            startFloor--;
            minAmountOfOperation++;
        }
        while (startFloor != lastFloor) {
            startFloor++;
            minAmountOfOperation++;
        }
        System.out.println(minAmountOfOperation);
    }

    public static void fromFirstToSecond(List<Integer> numberOfFloors, int positionOfEmployerOnFloor, int minAmountOfOperation) {

        int startFloor = numberOfFloors.get(positionOfEmployerOnFloor-1);
        int finishFloor = numberOfFloors.get(numberOfFloors.size()-1);
        while (startFloor != finishFloor){
            startFloor++;
            minAmountOfOperation++;
        }
        System.out.println(minAmountOfOperation);
    }

    public static void fromSecondToFirst(List<Integer> numberOfFloors, int positionOfEmployerOnFloor, int minAmountOfOperation) {
        int startFloor = numberOfFloors.get(positionOfEmployerOnFloor-1);
        int finishFloor = numberOfFloors.get(0);

        while (startFloor != finishFloor){
            startFloor--;
            minAmountOfOperation++;
        }
        System.out.println(minAmountOfOperation);
    }


    public static void main(String[] args) {


        //read from cansole
        Scanner scanner = new Scanner(System.in);
        int scannerCounter = 1;

        int numberOfContracts = 0;
        int timeOfEmployers = 0;
        List<Integer> numberOfFloors = new ArrayList<>();
        int positionOfEmployerOnFloor = 0;
        int minAmountOfOperation = 0;

        //READ FROM CONSOLE
        for (int i = 1; i <= 3; i++) {
            if (scannerCounter == 1) {
                List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt).toList();
                numberOfContracts = integerList.get(0);
                timeOfEmployers = integerList.get(1);
            } else if (scannerCounter == 2) {
                List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt).toList();
                numberOfFloors = integerList;
            } else if (scannerCounter == 3) {
                positionOfEmployerOnFloor = scanner.nextInt();
                break;
            }
            scannerCounter++;
        }


        if (numberOfContracts == 2 && positionOfEmployerOnFloor == 1) {
            fromFirstToSecond(numberOfFloors,positionOfEmployerOnFloor,minAmountOfOperation);
        }
        else if (numberOfContracts == 2 && positionOfEmployerOnFloor == 2) {
            fromSecondToFirst(numberOfFloors,positionOfEmployerOnFloor,minAmountOfOperation);
        }
        else if (numberOfFloors.get(positionOfEmployerOnFloor-1).equals(numberOfFloors.get(numberOfFloors.size() - 1))) {
            fromLastFloorToFirstFloor(numberOfFloors, positionOfEmployerOnFloor, minAmountOfOperation);
        }
        else if (numberOfFloors.get(positionOfEmployerOnFloor-1).equals(numberOfFloors.get(0))) {
            fromFirsFloorToLastFloor(numberOfFloors, positionOfEmployerOnFloor, minAmountOfOperation);
        } else if (Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(numberOfFloors.size()-1)) <= timeOfEmployers
                && numberOfContracts > 2) {
            fromLastFloorToFirstFloor(numberOfFloors,positionOfEmployerOnFloor,minAmountOfOperation);
        } else if (Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(0)) <= timeOfEmployers
                && numberOfContracts > 2){
                //&& (Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(0))) <= Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(numberOfFloors.size() - 1))) {
            fromFirsFloorToLastFloor(numberOfFloors, positionOfEmployerOnFloor, minAmountOfOperation);
        }
        else if (Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(0)) >= timeOfEmployers
                && numberOfContracts > 2
                && (Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(0))) >= Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(numberOfFloors.size() - 1))) {
            fromMiddleToUpThenToDown(numberOfFloors, positionOfEmployerOnFloor, minAmountOfOperation);
        }
        else if (Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(0)) > timeOfEmployers
                && numberOfContracts > 2
                && (Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(0))) <= Math.abs(numberOfFloors.get(positionOfEmployerOnFloor - 1) - numberOfFloors.get(numberOfFloors.size() - 1))) {
            fromMiddleToDownThenToUp(numberOfFloors, positionOfEmployerOnFloor, minAmountOfOperation);
        }
    }
}