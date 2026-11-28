import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductInventory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> inventory = new HashMap<>();

        int choice;

        do {
            System.out.println("\n--- Product Inventory Management ---");
            System.out.println("1. Add new product");
            System.out.println("2. Update product quantity");
            System.out.println("3. Sell product");
            System.out.println("4. Search product");
            System.out.println("5. Display low-stock products (quantity below 5)");
            System.out.println("6. Remove out-of-stock products");
            System.out.println("7. Display all products");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter product ID: ");
                    int productId = sc.nextInt();

                    if (inventory.containsKey(productId)) {
                        System.out.println("Product already exists. Use Update to change quantity.");
                    } else {
                        System.out.print("Enter available quantity: ");
                        int quantity = sc.nextInt();

                        if (quantity >= 0) {
                            inventory.put(productId, quantity);
                            System.out.println("Product added successfully.");
                        } else {
                            System.out.println("Quantity cannot be negative.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter product ID to update: ");
                    int updateId = sc.nextInt();

                    if (inventory.containsKey(updateId)) {
                        System.out.print("Enter new quantity: ");
                        int newQuantity = sc.nextInt();

                        if (newQuantity >= 0) {
                            inventory.put(updateId, newQuantity);
                            System.out.println("Quantity updated successfully.");
                        } else {
                            System.out.println("Quantity cannot be negative.");
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID sold: ");
                    int soldId = sc.nextInt();

                    int availableQuantity = inventory.getOrDefault(soldId, 0);

                    if (!inventory.containsKey(soldId)) {
                        System.out.println("Product not found.");
                    } else {
                        System.out.print("Enter quantity sold: ");
                        int soldQuantity = sc.nextInt();

                        if (soldQuantity <= 0) {
                            System.out.println("Sold quantity must be greater than 0.");
                        } else if (soldQuantity > availableQuantity) {
                            System.out.println("Not enough stock available.");
                        } else {
                            int remainingQuantity = availableQuantity - soldQuantity;
                            inventory.put(soldId, remainingQuantity);
                            System.out.println("Sale recorded successfully.");
                            System.out.println("Remaining quantity: " + remainingQuantity);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter product ID to search: ");
                    int searchId = sc.nextInt();

                    if (inventory.containsKey(searchId)) {
                        System.out.println(
                                "Product ID: " + searchId +
                                        ", Quantity: " + inventory.get(searchId));
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    boolean lowStockFound = false;

                    System.out.println("Products with quantity below 5:");

                    for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
                        if (entry.getValue() < 5) {
                            System.out.println(
                                    "Product ID: " + entry.getKey() +
                                            ", Quantity: " + entry.getValue());
                            lowStockFound = true;
                        }
                    }

                    if (!lowStockFound) {
                        System.out.println("No low-stock products.");
                    }
                    break;

                case 6:

                    boolean removed = inventory.values().removeIf(quantity -> quantity == 0);

                    if (removed) {
                        System.out.println("Out-of-stock products removed.");
                    } else {
                        System.out.println("No out-of-stock products to remove.");
                    }
                    break;

                case 7:
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("Product ID - Quantity");

                        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
                            System.out.println(
                                    entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting Product Inventory Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}