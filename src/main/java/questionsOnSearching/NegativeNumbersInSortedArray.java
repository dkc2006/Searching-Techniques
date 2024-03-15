package questionsOnSearching;

import java.util.Scanner;

public class NegativeNumbersInSortedArray {
       int getNegativeNumbersCount(int[] arr) {
        int countNegative = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < 0) {
                countNegative++;
            }
        }
        return countNegative;
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] arr = new int[8];
        for (int index = 0; index < arr.length; index++) {
                arr[index] = scanner.nextInt();
        }
        NegativeNumbersInSortedArray solution = new NegativeNumbersInSortedArray();
        int solution1 = solution.getNegativeNumbersCount(arr);
        System.out.println(solution1);
    }
}
