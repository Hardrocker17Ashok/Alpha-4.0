package BitManipulation;

import java.util.*;

public class ConvertBinaryToDecimal {

    static int BinToDec(int num) {
        int decnum = 0;
        int pow = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            decnum = (decnum + (lastdigit * ((int) Math.pow(2, pow))));
            pow++;
            num = num / 10;
        }
        return decnum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("binary number " + num + " decimal is = " + BinToDec(num));

    }
}
