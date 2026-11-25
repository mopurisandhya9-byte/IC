import java.util.LinkedHashSet;

class Main4 {
    public static void main(String[] args) {
        LinkedHashSet<String> course = new LinkedHashSet<>();

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
