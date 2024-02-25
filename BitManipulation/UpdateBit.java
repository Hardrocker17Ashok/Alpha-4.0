package BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    static int set(int num, int pos) {
        int bit = 1 << pos;
        return bit | num;
    }

    static int clear(int num, int pos) {
        int bit = ~(1 << pos);
        return bit & num;
    }

    static int update(int num, int pos, int bit) {
        if (bit == 0) {
            int q = clear(num, pos);
            return q;
        } else {
            int p = set(num, pos);
            return p;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        int bit = sc.nextInt();
        System.out.println("After update Ith value = " + update(num, pos, bit));

    }
}
