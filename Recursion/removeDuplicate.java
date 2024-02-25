package Recursion;

import java.util.*;

public class removeDuplicate {
    public static void remove(String str, int index, StringBuilder newstr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        if (map[currchar - 'a'] == true) {
            remove(str, index + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            remove(str, index + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "ashoookas";
        boolean arr[] = new boolean[20];
        remove(str, 0, new StringBuilder(""), arr);
    }
}
