public class NumberPattern {
    public static void main(String[] args) {

       
        int rows = 6;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int num = 1;
        int maxRows = 5;

        for (int i = 1; i <= maxRows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num++;

                // Reset to 1 after 9
                if (num > 9) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}