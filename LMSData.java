public class LMSData {
    public static void main(String[] args) {
        // Data for LMS Student Entity
        int studentID=101;
        String studentName = "Ravi";
        byte studentAge = 25;
        char studentGender = 'M'; 
        float studentRating = 4.5f;
        boolean isInstructor = false;
        //String courseName = "Java";
        Short courseID = 105;

        // Concatenation
        System.out.println("Student ID is " +studentID);
        System.out.println("Name is "+studentName);
        System.out.println("Age is " +studentAge);
        System.out.println("Gender is " +studentGender);
        System.out.println("ratinmg is " +studentRating);
        System.out.println("Is Trainer " +isInstructor);
        //System.out.println("Course is " +courseName);
        System.out.println("Course ID " +courseID);

        System.err.println("________________________________________________");
    //public class Course {
    int courseId=2301;                 // Unique Course ID
    String course_Name = "JavaFullStatck";           // Name of the course
    short No_of_Students=25;        // Brief about the course
    int durationWeeks=120;           // Duration of the course in weeks
    int courseFee=20000;            // Fee for the course
    boolean trainerAssigned=true;      // Name of the trainer assigned
   // }
    System.out.println("course Id is :" +courseId);
    System.out.println("courseName is :" +course_Name);
    System.out.println("durationWeeks of course: " +durationWeeks);
    System.out.println("Number of students in course: " +No_of_Students);
    System.out.println("courseFee: " +courseFee);
    System.out.println("Is Trainer :" +trainerAssigned);
System.err.println("________________________________________________");

    int trainerID=98765;               // Unique Trainer ID
    String Trainername= "sagar";                 // Full name of the trainer
    String email= "Sagar@gmail.com"; 
    int ContactNumber=789065432;               // Contact email
    String expertise="frontend";            // Area of specialization
    int experienceYears=5;         // Years of experience
    boolean isAvailable=true;         // Availability status

    System.out.println("trainerID: " +trainerID);
    System.out.println("Trainername: " +Trainername);
    System.out.println("email: " +email);
    System.out.println("ContactNumber: " +ContactNumber);
    System.out.println("expertise: " +expertise);
    System.out.println("experienceYears: " +experienceYears);
    System.out.println("isAvailable: " +isAvailable);
    

    }
}