package Recursion;

public class factorial {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int real = n * fact(n - 1);
        return real;
    }

    public static void main(String[] args) {
        int num = 2;
        System.out.println(fact(num));
    }
}
