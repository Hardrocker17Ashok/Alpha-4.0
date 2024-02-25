package BitManipulation;

import java.util.Scanner;

public class CheckPower {
    static boolean checkPower(int num){
        // because all number of 2 range is allwayes have 100000 number
        // and number-1 value have store 11111 number 
        // and AND operation of both is ==0 
        return (num&(num-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(checkPower(num)){
            System.out.println("The number in range of power 2!");
        }else{
            System.out.println("it's not!");
        }
        
    }
}
