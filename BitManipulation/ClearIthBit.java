package BitManipulation;

import java.util.Scanner;

public class ClearIthBit {
    static int funk(int num, int pos) {
        int bit = ~(1 << pos);
        return bit & num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        System.out.println("After Clear Ith value = " + funk(num, pos));

    }
}
