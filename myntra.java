  public class myntra {
    public static void main(String[] args) {
        String brand = "HIGHLANDER";
        String shirtDescription = "Men Comfort Relaxed Fit Textured Spread Collar Casual Shirt";
        float ratingOutOf5 = 4.6f;
        String priceDetailsLabel = "Price Details";
        int offerPrice = 750;
        float discountPercent = 81.0f;
        int mrp = 3949;

        // Sizes
        short sizeXS = 36;
        short sizeS = 39;
        short sizeM = 40;
        short sizeL = 42;
        short sizeXL = 44;

        // Output
        System.out.println("======================================");
        System.out.println("Brand: " + brand);
        System.out.println("Description: " + shirtDescription);
        System.out.println("Rating: ⭐ " + ratingOutOf5 + " / 5");
        System.out.println("--------------------------------------");
        System.out.println(priceDetailsLabel + ":");
        System.out.println("Maximum Retail Price (MRP): " + mrp);
        System.out.println("Discount: " + discountPercent + "% OFF");
        System.out.println("Selling Price: ₹" + offerPrice);
        System.out.println("--------------------------------------");
        System.out.println("Available Sizes:" + sizeXS + " ," + sizeS + ", " + sizeM + ", " + sizeL + ", " + sizeXL);
        System.out.println("======================================");
       }
    }