package String;
import java.util.*;
public class UperCase {
    static String funk(String s){
         StringBuilder ss=new StringBuilder();
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){
                ss.append(s.charAt(i));
                i++;
                ss.append(Character.toUpperCase(s.charAt(i)));
            }else{
                ss.append(s.charAt(i));
            }
         }
         return ss.toString();
    }
    static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="hello i am ashok sharma";
        print(str);
        System.out.println();
        System.out.println(funk(str));
    }
}
