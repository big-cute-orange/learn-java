public class WeatherDemo {
    public static void main(String[] args) {
        int temperatureC = 18;

        if (temperatureC < 10) {
            System.out.println("Cold");
        } else if (temperatureC < 25) {
            System.out.println("Mild");
        } else {
            System.out.println("Hot");
        }
    }
}
