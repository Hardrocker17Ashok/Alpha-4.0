package Recursion;

public class PrintIncrDecNumber {
    // incresing order
    public static void printnumberinDec(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printnumberinDec(num - 1);
    }

    // decresing order
    public static void printnumberinIncr(int num) {
        if (num == 0) {
            return;
        }
        printnumberinIncr(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("decrsing order");
        printnumberinDec(num);
        System.out.println("incrsing order");
        printnumberinIncr(num);
    }
}
