public class GenericSwap {
    public static <T1, T2> void swap(T1 value1, T2 value2) {
        System.out.println("Before swapping: " + value1 + ", " + value2);
        T1 temp = value1;
        value1 = (T1) value2;
        value2 = (T2) temp;
        System.out.println("After swapping: " + value1 + ", " + value2);
    }

    public static void main(String[] args) {
        char a = 'a';
        int b = 100;
        float c = 3.14f;
        double d = 2.5;
        String e = "java programming";

        swap(a, b);
        swap(c, d);
        swap(b, e);
    }
}
