public class ArrayBasicsDemo {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        scores[1] = 85;

        int[] alias = scores;
        alias[0] = 75;

        int[] emptyScores = new int[2];

        System.out.println("Length: " + scores.length);
        System.out.println("First: " + scores[0]);
        System.out.println("Second: " + scores[1]);
        System.out.println("Default value: " + emptyScores[0]);
    }
}
