public class ArrayTraversalDemo {
    public static void main(String[] args) {
        int[] scores = {60, 80, 100};

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + i + ": " + scores[i]);
        }

        int total = sum(scores);
        double average = (double) total / scores.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
