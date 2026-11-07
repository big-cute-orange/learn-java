public class StringBasicsDemo {
    public static void main(String[] args) {
        String raw = "  Java Basics  ";
        String title = raw.trim();

        System.out.println("Original: [" + raw + "]");
        System.out.println("Title: " + title);
        System.out.println("Length: " + title.length());
        System.out.println("First character: " + title.charAt(0));
        System.out.println("Prefix: " + title.substring(0, 4));
        System.out.println("Same content: " + title.equals("Java Basics"));

        String renamed = title.replace("Java", "Core");
        System.out.println("Renamed: " + renamed);
        System.out.println("Title again: " + title);
    }
}
