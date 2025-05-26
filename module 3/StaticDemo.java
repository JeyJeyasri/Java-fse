class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Count is " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.displayCount();  // Output: Count is 2
    }
}
