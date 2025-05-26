public class TypeCastingExample {
    public static void main(String[] args) {
        double dbl = 9.78;
        int castToInt = (int) dbl;

        int i = 42;
        double castToDouble = (double) i;

        System.out.println("Double to int: " + castToInt);
        System.out.println("Int to double: " + castToDouble);
    }
}
