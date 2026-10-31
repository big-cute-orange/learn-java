public class OperatorsDemo {
    public static void main(String[] args) {
        int total = 11;
        int groups = 4;

        int quotient = total / groups;
        int remainder = total % groups;
        double truncated = total / groups;
        double average = (double) total / groups;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Truncated: " + truncated);
        System.out.println("Average: " + average);
        System.out.println("Precedence: " + (2 + 3 * 4));
        System.out.println("Parentheses: " + ((2 + 3) * 4));
    }
}
