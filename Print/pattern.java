package Print;
public class Pattern {
    public static void main(String[] args) {
        int num = 6;

        // dimond print
        // first half
        System.out.println(" dimond shape ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= num * 2 - 2 * i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
