package CRM;

public class saleslead {
    public static void main(String[] args) {
        int leadId = 10112;
        String leadName = "Jahnavi";
        String leadEmail = "janujahnavi@gmail.com";
        long leadPhone = 56478390;
        String companyName = "PWC";
        String source = "Website";
        String leadCreatedDate = "04/06/2025";
        boolean isexperience = true;
        boolean isQualified = true;

        System.out.println("\n=== Sales Lead ===");
        System.out.println("Lead ID: " + leadId);
        System.out.println("Name: " + leadName);
        System.out.println("Email: " + leadEmail);
        System.out.println("Phone: " + leadPhone);
        System.out.println("Company: " + companyName);
        System.out.println("Source: " + source);
        System.out.println("Created On: " + leadCreatedDate);
        System.out.println("Experienced: " + isexperience);
        System.out.println("Qualified: " + isQualified);
    }
    
}
