public class FullPyramid {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {     // Rows

            // Print spaces
            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    
    }
}