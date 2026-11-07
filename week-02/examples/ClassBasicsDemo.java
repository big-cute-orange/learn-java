public class ClassBasicsDemo {
    public static void main(String[] args) {
        Book first = new Book();
        first.title = "Java Basics";
        first.pages = 120;

        Book second = new Book();
        second.title = "Java Collections";
        second.pages = 200;

        first.describe();
        second.describe();
    }
}

class Book {
    String title;
    int pages;

    void describe() {
        System.out.println(title + " - " + pages + " pages");
    }
}
