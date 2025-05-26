import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("LinkedList: " + list);

        list.removeFirst();
        System.out.println("After removing first: " + list);
    }
}

