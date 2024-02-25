package BitManipulation;

import java.util.Scanner;

public class CountSetAndClearBit {
    static int Count(int num) {
        int set = 0;
        // int clear=0;
        while (num > 0) {
            if ((num & 1) != 0) {
                set++;
            }
            // if we find clear bit so we can as

            // else{
            // clear++;
            // }
            num = num >> 1;
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("set bit is = " + Count(num));

    }
}
