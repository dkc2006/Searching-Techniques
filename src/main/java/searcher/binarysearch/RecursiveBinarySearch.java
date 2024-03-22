package searcher.binarysearch;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] numbers, int key, int firstindex, int lastindex) {
        int middleindex = firstindex + ((lastindex - firstindex) / 2);
        if (lastindex < firstindex) {
            return -1;
        } else if (key == numbers[middleindex]) {
            return middleindex;
        } else if (key < numbers[middleindex]) {
            return binarySearch(numbers, key, firstindex, middleindex - 1);
        } else {
            return binarySearch(numbers, key, middleindex + 1, lastindex);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int key = 7;
        int search = binarySearch(numbers, key, 0, numbers.length - 1);
        if (search == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key is at index : " + search);
        }
    }
}
