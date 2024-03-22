package searcher.binarysearch;

public class StringsBinarySearch {

    public static int binaryserach(String[] names, String key, int firstIndex, int lastIndex) {
        int index = Integer.MAX_VALUE;
        while (firstIndex <= lastIndex) {
            int middleindex = firstIndex + ((lastIndex - firstIndex) / 2);
            if (names[middleindex] == key) {
                return middleindex;
            } else if (names[middleindex].compareTo(key) < 0) {
                firstIndex = middleindex + 1;
            } else if (names[middleindex].compareTo(key) > 0) {
                lastIndex = middleindex - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Kanu", "Rahul", "Khandelwal", "Tushar", "Kush", "Vansh"};
        String key = "Kush";
        System.out.println("index for key is : " + binaryserach(names, key, 0, names.length - 1));
    }

}
