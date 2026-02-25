public class AlphabetPyramid {

    public static void main(String[] args) {

        int rows = 5;

        // ----- Star Pattern -----
        for (int i = 1; i <= rows; i++) {

            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) System.out.print(" ");
            }

            System.out.println();
        }

        // ❌ Removed the extra println here

        // ----- Alphabet Pattern -----
        for (int i = 0; i < rows; i++) {

            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows - i; j++) {
                System.out.print((char) ('A' + j));
                if (j < rows - i - 1) System.out.print(" ");
            }

            System.out.println();
        }
    }
}