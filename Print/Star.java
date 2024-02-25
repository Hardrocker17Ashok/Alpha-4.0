public class Star {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(" fullfill shape ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println(" hollow shape ");
        // hollow
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= num; k++) {
                if (i == 1 || i == num || k == 1 || k == num) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

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
            System.out.println();
        }

        // second half
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // butterfly shape
        System.out.println(" butterfly shape ");
        // first half
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // second half
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}