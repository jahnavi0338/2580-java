package CRM;

public class opp {
    public static void main(String[] args) {
        int opportunityId = 3001;
        String productOrService = "Cloud Hosting Plan";
        double dealValue = 15000.75;
        String stage = "Negotiation";
        String expected_close_date = "10/11/2026";
        float estimated_value = 75000.54f;
        String created_by = "janu";
        boolean isClosed = false;

        System.out.println("=== Sales Opportunity ===");
        System.out.println("Opportunity ID: " + opportunityId);
        System.out.println("Product/Service: " + productOrService);
        System.out.println("Deal Value: $" + dealValue);
        System.out.println("Stage: " + stage);
        System.out.println("Estimated value : " + estimated_value);
        System.out.println("Created_By : " + created_by);
        System.out.println("Is Closed: " + isClosed);

    }
    
}
