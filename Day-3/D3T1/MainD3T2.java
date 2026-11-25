class StudentName {
    String name = "Sandy";

    void display() {

        System.out.println("Total number of characters: " + name.length());

        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1));
        System.out.println("Fifth character: " + name.charAt(4));
    }
}

public class MainD3T2 {
    public static void main(String[] args) {
        StudentName s1 = new StudentName();

        s1.display();
    }
}