package junit.test;

import java.util.Scanner;

public class BoilingWater {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number greater than 212:");
        int num = Integer.valueOf(scanner.nextLine());
        checkIfBoiling(num);
    }

    public static String checkIfBoiling(int num) {
        if (num > 212) {
            return "Water is boiling!";
        } else if (num == 212) {
            return "Water is starting to boil...";
        }
        return "Water isn't boiling yet...";
    }
}
