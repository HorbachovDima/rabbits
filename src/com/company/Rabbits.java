package com.company;

public class Rabbits {

    public static void main(String[] args) {

        willTwoRabbitsMeet(0, 3, 4, 2);
    }

    public static void willTwoRabbitsMeet(int x1, int v1, int x2, int v2) {
        boolean flag = checkBasicCases(x1, v1, x2, v2);

        int firstRabbit = x1;
        int secondRabbit = x2;

        int shorterJumpLengthOfTheRabbit = 0;
        int incrementForShorterLength = 0;
        int longerJumpLengthOfTheRabbit = 0;
        int incrementForLongerLength = 0;

        if (firstRabbit > secondRabbit) {
            shorterJumpLengthOfTheRabbit = secondRabbit;
            incrementForShorterLength = v2;
            longerJumpLengthOfTheRabbit = firstRabbit;
            incrementForLongerLength = v1;
        } else if (firstRabbit < secondRabbit) {
            shorterJumpLengthOfTheRabbit = firstRabbit;
            incrementForShorterLength = v1;
            longerJumpLengthOfTheRabbit = secondRabbit;
            incrementForLongerLength = v2;
        }

        while (flag) {
            shorterJumpLengthOfTheRabbit += incrementForShorterLength;
            longerJumpLengthOfTheRabbit += incrementForLongerLength;
            firstRabbit += v1;
            secondRabbit += v2;
//            System.out.println(firstRabbit + " " + secondRabbit);
            if (firstRabbit == secondRabbit) {
                flag = false;
                System.out.println("YES");
            } else if (shorterJumpLengthOfTheRabbit > longerJumpLengthOfTheRabbit) {
                flag = false;
                System.out.println("NO");
            }
        }
    }

    private static boolean checkBasicCases(int x1, int v1, int x2, int v2) {
        if (v1 < 0 || v2 < 0) {
            System.out.println("Do not use negative numbers!");
            return false;
        } else if (x1 > x2 && v1 > v2 || x2 > x1 && v2 > v1 || x1 == x2 && v1 != v2 || x1 != x2 && v1 == v2) {
            System.out.println("NO");
            return false;
        } else if (x1 == x2 && v1 == v2) {
            System.out.println("YES");
            return false;
        }
        return true;
    }
}
