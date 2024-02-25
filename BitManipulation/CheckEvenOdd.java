package BitManipulation;
import java.util.*;
    // How is working
    // we know last digit of all even number is 0  
    // so if we do AND operation with 1 
    // than all digit will bi 0 than we can say its even number  
    // and if last digit is 1 in which have odd number than instend last digit 
    // all privious digit will be 0 than totle answer will be 1 than we can
    // say thje number is odd
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num&1)== 0){
            System.out.println("the number is even ");
        }else{
            System.out.println("the number is odd");
        }
    }
}
