package questionsOnSearching;

public class ReverseAnArray {
    public static void reverse(int[] numbers) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 6, 8, 10};
        reverse(numbers);
        //print
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index] + " ");
        }
        System.out.println();
    }
}
