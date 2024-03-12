//Find the largest number in given array
//1,2,3,6,5,4
package questionsOnSearching;

public class FindLargestNumber {
    public static int getLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE; //-infinity

        for (int index = 0; index < numbers.length; index++) {
            if (largest < numbers[index]) {
                largest = numbers[index];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 6, 5, 4};
        System.out.println("largest number is :" + getLargest(numbers));
    }
}
