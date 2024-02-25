package BitManipulation;
import java.util.*;
public class CheckIthBit {
    // How is working
    // 10101010 and find 2 numnber of index
    // than we can shift number of index by 1 like 1<<index
    // and than do AND operation whereby we find exect location
    static int funk(int num,int pos){
        int bit=1<<pos;
        if((num&bit)== 0){
           return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pos=sc.nextInt();
        System.out.println("The Ith bit is = "+funk(num,pos));
        
    }
}
