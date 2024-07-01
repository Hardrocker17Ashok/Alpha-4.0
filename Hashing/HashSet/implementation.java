package Hashing.HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class implementation {
    public static void main(String[] args) {
        // java collection freamwork deal with object thats'why we use Integer class whose non primtive data type
        // Integer is class who refrence to int as object
        HashSet<Integer>set=new HashSet<>();
        // add element O(1)
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(3);
        set.add(22);
        set.add(2);

        // print
        System.out.println(set);
        //  check element presant or not in set
        System.out.println(set.contains(4));

        // remove O(1)
        set.remove(3);
        System.out.println(set);
        
        // for  iterator each and evrey element of set

        // Iterator it=set.iterator();
        // while (it.hasNext()) {
        //     if(it.next()%2==0){
        //         System.out.println("even");
        //     }
        //     System.out.println(it.next());
        // }

        for(int i:set){
            if(i%2==0){
                System.out.println("even");
            }
        }
    }
}
