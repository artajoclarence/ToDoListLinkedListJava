import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        int choice;

        do {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    toDoList.addTask(title);
                    break;
                case 2:
                    System.out.print("Enter task title to delete: ");
                    String deleteTitle = scanner.nextLine();
                    toDoList.deleteTask(deleteTitle);
                    break;
                case 3:
                    toDoList.printTasks();
                    break;
                case 4:
                    System.out.print("Enter task title to search: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = toDoList.contains(searchTitle);
                    if (found) {
                        System.out.println("\nTask found!");
                    } else {
                        System.out.println("\nTask not found.");
                    }
                    break;
                case 5:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
