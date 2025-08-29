public class ToDoList {
    private TaskNode head;

    public ToDoList() {
        this.head = null;
    }

    public void addTask(String title) {
        TaskNode newNode = new TaskNode(title);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("\nTask added!");
    }

    public void deleteTask(String title) {
        if (head == null) {
            System.out.println("\nNo tasks to delete.");
            return;
        }

        if (head.title.equalsIgnoreCase(title)) {
            head = head.next;
            System.out.println("\nTask deleted!");
            return;
        }

        TaskNode current = head;
        TaskNode previous = null;

        while (current != null && !current.title.equalsIgnoreCase(title)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("\nTask not found.");
        } else {
            previous.next = current.next;
            System.out.println("\nTask deleted!");
        }
    }

    public void printTasks() {
        if (head == null) {
            System.out.println("\nYour task list is empty.");
            return;
        }

        System.out.println("\nYour Tasks:");
        TaskNode current = head;
        while (current != null) {
            System.out.println("- " + current.title);
            current = current.next;
        }
    }

    public boolean contains(String title) {
        TaskNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
