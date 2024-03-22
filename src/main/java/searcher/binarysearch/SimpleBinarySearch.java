package searcher.binarysearch;

public class SimpleBinarySearch {
    public static int binaryserach(int[] numbers, int key, int firstIndex, int lastIndex) {
        int index = Integer.MAX_VALUE;
        while (firstIndex <= lastIndex) {
            int middleindex = firstIndex + ((lastIndex - firstIndex) / 2);
            if (numbers[middleindex] == key) {
                return middleindex;
            } else if (numbers[middleindex] < key) {
                firstIndex = middleindex + 1;
            } else if (numbers[middleindex] > key) {
                lastIndex = middleindex - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int key = 7;
        System.out.println("index for key is : " + binaryserach(numbers, key, 0, numbers.length - 1));
    }


}
