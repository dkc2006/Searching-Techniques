package searcher.binarysearch;

public class StudentBinarySearch {
    int rollNumber;
    String name;

    public StudentBinarySearch(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentBinarySearch{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
    }
}

class Searcher {
    public static int search(StudentBinarySearch[] student, int key) {
        for (int index = 0; index < student.length; index++) {
            if (student[index].rollNumber == key) {
                return index;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        StudentBinarySearch[] names = new StudentBinarySearch[]
                {new StudentBinarySearch(9, "Lala ji"),
                 new StudentBinarySearch(6, "Aman"),
                 new StudentBinarySearch(10, "Abhay"),
                 new StudentBinarySearch(2, "radhe"),
                 new StudentBinarySearch(1, "Abhishek")};
        int key = 10;
        int index = search(names, key);
        if (index != -1) {
            System.out.println("Student found at index : " + index);
            System.out.println("Student details : " + names[index]);
        } else {
            System.out.println("Student not found");
        }
    }
}
