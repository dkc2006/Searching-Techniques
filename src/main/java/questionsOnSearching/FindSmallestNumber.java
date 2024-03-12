package questionsOnSearching;

public class FindSmallestNumber {

        public static int getSmallest(int[] numbers) {
            int smallest = Integer.MAX_VALUE; //infinity

            for (int index = 0; index < numbers.length; index++) {
                if (smallest > numbers[index]) {
                    smallest = numbers[index];
                }
            }
            return smallest;
        }

        public static void main(String[] args) {
            int[] numbers = new int[]{1, 2, 3, 6, 5, 4};
            System.out.println("smallest number is :" + getSmallest(numbers));
        }


}
