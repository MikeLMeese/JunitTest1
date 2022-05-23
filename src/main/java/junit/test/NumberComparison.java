package junit.test;

import java.util.Scanner;

public class NumberComparison {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        compareNumbers(firstNum, secondNum);
    }

    public static String compareNumbers(int firstNum, int secondNum) {
        if (firstNum == secondNum) {
            return "Both numbers are the same";
        } else if (firstNum > secondNum) {
            return "The first number was larger than the second";
        }
        return "The second number was larger than the first";
    }
}