public class MahindraThar {
    public static void main(String[] args) {
        // Basic Info
        String carName = "Mahindra Thar";
        float rating = 4.5f;
        float reviews = 1.4f;

        // Price Range
        float minPriceLakh = 11.50f;
        float maxPriceLakh = 17.62f;

        // EMI Info
        int emiPerMonth = 31036;
        float interestRate = 9.8f;
        int durationMonths = 48;

        // Specifications
        String engine = "1497 cc - 2184 cc";
        String power = "116.93 - 150.19 bhp";
        int seatingCapacity = 4;
        String torque = "300 Nm - 320 Nm";
        int groundClearanceMM = 226;
        String driveType = "4WD / RWD";
        String safetyRating = "4 Star";

        // Output
        System.out.println("======================================");
        System.out.println("Car: " + carName);
        System.out.println("Rating: ⭐ " + rating + " (" + reviews + "k reviews)");
        System.out.println("Price Range: ₹" + minPriceLakh + "L - ₹" + maxPriceLakh + "L (Ex-Showroom)");
        System.out.println("--------------------------------------");
        System.out.println("Key Specifications:");
        System.out.println("Engine: " + engine);
        System.out.println("Power: " + power);
        System.out.println("Torque: " + torque);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Ground Clearance: " + groundClearanceMM + " mm");
        System.out.println("Drive Type: " + driveType);
        System.out.println("Global NCAP Safety Rating: " + safetyRating);
        System.out.println("--------------------------------------");
        System.out.println("EMI Details:");
        System.out.println("Monthly EMI: ₹" + emiPerMonth);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Duration: " + durationMonths + " months");
        System.out.println("======================================");
    }
}
