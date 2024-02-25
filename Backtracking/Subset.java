package Backtracking;

public class Subset {
    // like abc=> abc,ab,bc,ca,a,b,c,null =>formula-> 2 ki power n
    public static void findsubset(String str, int ind, String newstr) {
        if (ind == str.length()) {
            System.out.println(newstr);
            return;
        }
        // for true
        findsubset(str, ind + 1, newstr + str.charAt(ind));
        // for false
        findsubset(str, ind + 1, newstr);
    }

    public static void main(String[] args) {
        findsubset("abc", 0, new String(""));
    }
}
