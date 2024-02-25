package ArrayList;

import java.util.*;

public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1 Add element add()->O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        //2 get element get()->O(1)
        // System.out.println(list.get(3));
        // System.out.println(list.get(1));

        //3 travesal in arraylist
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //4 remove element remove->O(n)
        // list.remove(2);
        // list.remove(3);
        // System.out.println(list);

        //5 contain element , this function give true or false =>O(n)
        System.out.println(list.contains(10));

        //6 set element =>O(n)
        list.set(1,100);
        System.out.println(list);
    }
}
