public class MethodsDemo {
    public static void main(String[] args) {
        printTopic("Methods");
        int total = add(20, 25);
        System.out.println("Total: " + total);
    }

    static void printTopic(String topic) {
        System.out.println("Topic: " + topic);
    }

    static int add(int left, int right) {
        return left + right;
    }
}
