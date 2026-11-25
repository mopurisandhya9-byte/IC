import java.util.TreeSet;

class Main3 {
    public static void main(String[] args) {
        TreeSet<String> course = new TreeSet<>();

        course.add("java");
        course.add("python");
        course.add("react");
        course.add("java");

        System.out.println(course);

        System.out.println("contains java:" + course.contains("java"));

        course.remove("python");

        System.out.println("After remover:" + course);
    }

}
