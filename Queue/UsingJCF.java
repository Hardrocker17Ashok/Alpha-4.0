package Queue;
import java.util.*;
public class UsingJCF {
    public static void main(String[] args) {
        // because queue is interface not a class that's why we can't create object of this
        // and queue interface implement by linkedlist class that's we create object of this class
       Queue<Integer> qu=new LinkedList<>();
       qu.add(12);
       qu.add(10);
       qu.add(20);
       qu.add(30);
       qu.add(40);
       System.out.println(qu);
       System.out.println(qu.peek());
       qu.remove();
       qu.remove();
       System.out.println(qu);

    }
}
