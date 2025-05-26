import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();

        System.out.println("Enter student ID and name (type ID 0 to stop):");

        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            if (id == 0) break;

            System.out.print("Name: ");
            String name = sc.nextLine();

            students.put(id, name);
        }

        System.out.print("Enter ID to retrieve name: ");
        int id = sc.nextInt();

        if (students.containsKey(id)) {
            System.out.println("Name: " + students.get(id));
        } else {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}
