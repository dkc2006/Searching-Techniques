package searcher.linearsearch;

public class StudentLinearSearch {
    int rollNumber;
    String name;

    public StudentLinearSearch(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentLinearSearch{" + "rollNumber=" + rollNumber + "," + " name='" + name + '\'' + '}';
    }
}

class Searcher {
    public static void main(String[] args) {
        StudentLinearSearch[] student = new StudentLinearSearch[]{new StudentLinearSearch(9, "Ram"), new StudentLinearSearch(3, "Akash"), new StudentLinearSearch(1, "Abhishek")};
        int key = 3;
        int index = search(student, key);
        if (index != -1) {
            System.out.println("Student found at index : " + index);
            System.out.println("Student details: " + student[index]);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static int search(StudentLinearSearch[] student, int key) {
        for (int index = 0; index < student.length; index++) {
            if (student[index].rollNumber == key) {
                return index;
            }
        }
        return -1;
    }
}