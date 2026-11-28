import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, String> orders = new LinkedHashMap<>();

        orders.put(101, "Preparing");
        orders.put(102, "Packed");
        orders.put(103, "Out for Delivery");
        orders.put(104, "Delivered");

        orders.put(101, "Packed");
        orders.put(102, "Out for Delivery");

        System.out.print("Enter Order ID: ");
        int id = sc.nextInt();

        if (orders.containsKey(id))
            System.out.println("Order Status: " + orders.get(id));
        else
            System.out.println("Order Not Found!");

        orders.remove(104);

        System.out.println("\nAll Active Orders:");
        for (Map.Entry<Integer, String> e : orders.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        HashMap<String, Integer> count = new HashMap<>();

        for (String status : orders.values()) {
            count.put(status, count.getOrDefault(status, 0) + 1);
        }

        System.out.println("\nOrder Status Count:");
        System.out.println("Preparing: " + count.getOrDefault("Preparing", 0));
        System.out.println("Packed: " + count.getOrDefault("Packed", 0));
        System.out.println("Out for Delivery: " +
                count.getOrDefault("Out for Delivery", 0));
        System.out.println("Delivered: " + count.getOrDefault("Delivered", 0));

        sc.close();
    }
}