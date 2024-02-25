package Recursion;

public class SumFirstNeturalNumber {
    public static int sumFunk(int num) {
        if (num == 1) {
            return 1;
        }
        int real = num + sumFunk(num - 1);
        return real;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(sumFunk(num));
    }
}