package questionsOnSearching;

import java.util.Scanner;

public class ContainsIntegerElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 3, 3, 4, 4, 5};
        int key = scanner.nextInt();
        ContainsIntegerElement solution = new ContainsIntegerElement ();
        boolean solution1 = solution.containsElement(arr, key);
        System.out.println(solution1);
    }

    boolean containsElement(int[] arr, int key) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return true;
            }
        }
        return false;
    }
}
