package String;

public class CheckPalindrome {
    static boolean Check(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="papap";
        if(Check(str)){
            System.out.println("this is palindrome");
        }else{
            System.out.println("it's not palindrome");
        }
    }
}
