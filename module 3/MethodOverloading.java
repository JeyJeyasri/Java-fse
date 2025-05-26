public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 3));           // 8
        System.out.println(add(5.5, 3.3));       // 8.8
        System.out.println(add(1, 2, 3));        // 6
    }
}

