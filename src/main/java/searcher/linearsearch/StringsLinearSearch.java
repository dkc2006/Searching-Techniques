package searcher.linearsearch;

public class StringsLinearSearch {
    public static void main(String[] args) {
        String[] names = new String[]{"Deepanshu", "Mayank", "Pranjal", "Govind", "Rajat", "Madhav"};
        StringsLinearSearch stringsLinearSearcher = new StringsLinearSearch();
        int search = stringsLinearSearcher.linearSearch(names, "Kulldeep");
        System.out.println(search);

    }

    public int linearSearch(String[] names, String key) {
        for (int index = 0; index < names.length; index++) {
            if (names[index].equals(key)) {
                return index;
            }
        }
        return -1;
    }
}
