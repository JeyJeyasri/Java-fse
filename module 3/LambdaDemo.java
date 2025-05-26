import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 8, 1, 9}; // Changed to Integer[]

        // Lambda expression for custom comparator
        Arrays.sort(numbers, (a, b) -> a - b);

        System.out.println("Sorted numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
