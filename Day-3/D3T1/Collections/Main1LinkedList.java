import java.util.LinkedList;

public class Main1LinkedList {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("learn java");
        tasks.add("learn SQL");
        tasks.add("learn react");

        tasks.addFirst("Start Training");
        tasks.addFirst("Build Project");

        System.out.println(tasks);

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("After removal:" + tasks);
    }
}
