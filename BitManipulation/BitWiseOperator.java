package BitManipulation;

public class BitWiseOperator {
    public static void main(String[] args) {
        /*
         * there are 6 type of bitwise operator
         * |  or operator
         * &  operator
         * ^  XOR operator
         * ~  1's compliment(not operator)
         * << left shift operator
         * it means-> 1001010=>2 left  shift is -> 1 0 0 1 0 1 0 0 0
         * >> right shift operator
         * it means ->1001010=>2 right shift is -> 0 0 1 0 0 1 0 1 0 
         */

        //  or operator
        int a=7;
        int b=11;
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);
        System.out.println(a<<2);
        System.out.println(a>>2);
        System.out.println(~b);
    }
}