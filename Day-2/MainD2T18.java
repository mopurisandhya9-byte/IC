class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void showResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class MainD2T18 {
    public static void main(String[] args) {

        Student s1 = new Student("Sandhya", 95.5);
        Student s2 = new Student("Bobi", 88.5);

        s1.showResult();
        s2.showResult();
    }
}
