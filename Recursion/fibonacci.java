package Recursion;

public class fibonacci {
    public static int Fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int real1 = Fibonacci(n - 1);
        int real2 = Fibonacci(n - 2);
        return real1 + real2;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(Fibonacci(num));
    }
}
