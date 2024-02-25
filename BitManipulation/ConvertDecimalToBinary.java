package BitManipulation;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    static int DecToBin(int num) {
        int binnumber = 0;
        int pow = 0;
        while (num > 0) {
            int digit = num % 2;
            binnumber = binnumber + (digit * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        return binnumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Decimal number " + num + " Binary is = " + DecToBin(num));

    }
}
