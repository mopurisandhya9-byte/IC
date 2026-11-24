class Student {
    private String name;
    private int rollnumber;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public int getrollnumber() {
        return rollnumber;
    }

    public void setrollnumber(int r) {
        rollnumber = r;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setname("Sandy");
        student.setrollnumber(74);

        System.out.println("Name: " + student.getname());
        System.out.println("Roll number: " + student.getrollnumber());
    }

}