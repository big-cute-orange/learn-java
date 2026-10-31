public class DeliverySummaryDemo {
    public static void main(String[] args) {
        String destination = "Library";
        int parcelCount = 3;
        int weightPerParcelKg = 4;
        int totalWeightKg = parcelCount * weightPerParcelKg;

        System.out.println("Destination: " + destination);
        System.out.println("Total weight (kg): " + totalWeightKg);

        if (totalWeightKg <= 15) {
            System.out.println("Within limit");
        } else {
            System.out.println("Over limit");
        }

        for (int parcelNumber = 1; parcelNumber <= parcelCount; parcelNumber++) {
            System.out.println("Parcel " + parcelNumber);
        }
    }
}
