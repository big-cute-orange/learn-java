public class WhileLoopDemo {
    public static void main(String[] args) {
        int remaining = 3;

        while (remaining > 0) {
            System.out.println("Remaining before processing: " + remaining);
            remaining--;
        }

        System.out.println("Finished. Remaining: " + remaining);
    }
}
