package String;

public class CheckTwoString {
     public static void main(String[] args) {
     String s1="AshokSharma";
     String s2="ashokk";
     String s3=new String("ashok");
     boolean check=s1.equals(s3);
     System.out.println(check);
     System.out.println("some substring of this string");
     System.out.println(s1.substring(2, 7));
     System.out.println(s1.substring(2));
    }
}
