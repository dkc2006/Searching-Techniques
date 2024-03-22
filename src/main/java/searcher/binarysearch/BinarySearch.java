package searcher.binarysearch;

public class BinarySearch {
    public static int binarySearch(int key, int[] numbers) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            //Comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("index for key is : " + binarySearch(key, numbers));
    }
}
