package String;

public class PassingString {
    static void printString(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str="Hello bhaishab how are you";
        printString(str);
    }
}
