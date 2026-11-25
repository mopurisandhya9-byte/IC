import java.util.HashSet;

class Main2HashSet {
    public static void main(String[] args) {
        HashSet<String> course = new HashSet<>();

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
