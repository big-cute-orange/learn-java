public class EncapsulationDemo {
    public static void main(String[] args) {
        StudySession session = new StudySession();

        System.out.println("Initial minutes: " + session.getMinutes());
        System.out.println("Accept 30: " + session.setMinutes(30));
        System.out.println("Accept -5: " + session.setMinutes(-5));
        System.out.println("Current minutes: " + session.getMinutes());
    }
}

class StudySession {
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public boolean setMinutes(int minutes) {
        if (minutes < 0) {
            return false;
        }
        this.minutes = minutes;
        return true;
    }
}
