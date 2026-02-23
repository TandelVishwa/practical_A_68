public class OddNumbersStats {
    public static void main(String[] args) {

        int min = 999, max = 0, sum = 0;

        System.out.println("Odd Numbers:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;

                if (i < min)
                    min = i;
                if (i > max)
                    max = i;
            }
        }

        System.out.println("\nMinimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
    }
}