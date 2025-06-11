public class Applicationform {
    public static void main(String[] args) {

        // Basic Info
        String lastName = "Gaddiboyina";
        String firstName = "Sai";
        String middleName = "Jahnavi";
        String address = "sklm";
        String dateOfBirth = "2004-09-06";
        String birthplace = "Srikakulam City";
        String citizenship = "Indian";
        String sex = "female";
        String civilStatus = "Single";
        String religion = "Hindhu";
        long contactNumber = 74903674;
        String spouseName = "N/A";
        String spouseContact = "N/A";

        String fatherName = "Krishna";
        String fatherOccupation = "Lic Agent";
        long fatherContact = 98653209;

        String motherName = "Rama";
        String motherOccupation = "Housewife";
        long motherContact = 9764002;

        String shsName = "Narayana High School";
        int yearGraduated = 2019;
        double genAverage = 90.5;

        
        // Output the form information
        System.out.println("=== College Admission Application Form ===\n");

        System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("Citizenship: " + citizenship);
        System.out.println("Sex: " + sex);
        System.out.println("Civil Status: " + civilStatus);
        System.out.println("Religion: " + religion);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Spouse: " + spouseName + ", Contact: " + spouseContact);

        System.out.println("\n--- Father Info ---");
        System.out.println("Name: " + fatherName);
        System.out.println("Occupation: " + fatherOccupation);
        System.out.println("Contact: " + fatherContact);

        System.out.println("\n--- Mother Info ---");
        System.out.println("Name: " + motherName);
        System.out.println("Occupation: " + motherOccupation);
        System.out.println("Contact: " + motherContact);

        

        System.out.println("\n--- Senior High School ---");
        System.out.println("School: " + shsName);
       // System.out.println("Strand: " + shsStrand);
        //System.out.println("Year Graduated: " + yearGraduated);
        System.out.println("General Average: " + genAverage);

    
        
    }
}
