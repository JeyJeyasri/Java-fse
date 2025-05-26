import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) return mid;
            if (arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        Arrays.sort(arr);

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);

        sc.close();
    }
}
