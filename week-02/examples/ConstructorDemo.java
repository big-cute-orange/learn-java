public class ConstructorDemo {
    public static void main(String[] args) {
        Course course = new Course("Java", 30);
        course.describe();
    }
}

class Course {
    String topic;
    int minutes;

    Course(String topic, int minutes) {
        this.topic = topic;
        this.minutes = minutes;
    }

    void describe() {
        System.out.println(topic + ": " + minutes + " minutes");
    }
}
