import java.util.ArrayList;

public class GenericsDemo {
    public static <T> void printArray(ArrayList<T> list) {
        for (T elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        printArray(intList);
        printArray(strList);
    }
}
