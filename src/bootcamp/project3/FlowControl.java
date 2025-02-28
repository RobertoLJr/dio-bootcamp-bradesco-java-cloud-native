package bootcamp.project3;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class FlowControl {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the starting integer: ");
                int start = sc.nextInt();

                System.out.print("Enter the ending integer: ");
                int end = sc.nextInt();

                System.out.println();
                printNumbersInRange(start, end);
                break;
            } catch (InvalidParamsException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Print each integer from the start parameter to the end parameter, separated by commas.
     *
     * @param start The starting integer of the range (inclusive).
     * @param end The ending integer of the range (inclusive).
     * @throws InvalidParamsException if the start value is greater than the end value.
     */
    private static void printNumbersInRange(int start, int end) throws InvalidParamsException {
        if (start > end) throw new InvalidParamsException("!!! The second parameter must be greater than the first one !!!");

        StringJoiner joiner = new StringJoiner(", ");
        for (int i = start; i <= end; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }
}
