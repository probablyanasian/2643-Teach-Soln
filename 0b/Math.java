public class Math {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.printf("a plus b is : %d", a+b);
        System.out.printf("a minus b is : %d", a-b);

        // Since this is a decimal, we have to use %f and cast one of the variables to a double first, then divide.
        System.out.printf("a divided by b is : %f", (double)a/b);

        System.out.printf("a times b is : %d", a*b);
        System.out.printf("a modulo b is : %d", a%b);

    }
}