package CRM;

public class Customercontactdetails {

    public static void main(String[] args) {
        int customerId = 456780;
        String firstName = "Jahnavi";
        String lastName = "Gaddiboyina";
        String email = "jahnavi@gmail.com";
        long phoneNumber = 7658490324;
        String address = "ayyappa society,madhapur,HYD";
        String registrationDate = "02/06/2025";

        System.out.println("----- Customer Info -----");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Registered On: " + registrationDate);
    }
}