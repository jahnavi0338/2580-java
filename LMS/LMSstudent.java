package LMS;
import java.util.Scanner;

public class LMSstudent {
    int student_ID;
    String student_Name;
    int attendance_Credits;
    int performance_Credits;
    int final_Credits;
    int trainer_Ratings;
    
    public void studentInfo() {
        System.out.println("===============STUDENT DETAILS===============");
        System.out.print("Enter Student ID: ");
        student_ID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Student Name: ");
        student_Name = sc.nextLine();
    
    }
    Scanner sc = new Scanner(System.in);
    public int sessionsAttendedCredits(){
        System.out.println("Enter Number Of Sessions Attended");
        int NOFsAttended = sc.nextInt();
        sc.nextLine(); 
        if (NOFsAttended >=30) {
            return attendance_Credits+=5;
        } else if (NOFsAttended >=20) {
            return attendance_Credits+=3;
        } else {
            
            return attendance_Credits=0; 
        }
    }
     public int performanceScoreCredits(){
        System.out.println("Enter Score:");
        int score = sc.nextInt();
        if (score>=85) {
            return performance_Credits+=5;
        } else if(score>=60){
            return performance_Credits+=3;
        } else {
            return performance_Credits+=0;
        }
    }
    public String achievementStatus(){
        final_Credits = attendance_Credits + performance_Credits;
        if (final_Credits>=10) {
            return "GOLD";
        } else if (final_Credits>=8) {
            return "SILVER";
        } else {
            return "You Need To IMPROVE";
        }
    }
    int addBouns;
    public int trainer_Ratings(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Trainers rating (1-5):");
        trainer_Ratings = sc.nextInt();
        if (trainer_Ratings==5) {
            return addBouns+=5000;
        } else {
            return addBouns+=0;
        }
        
    }

}
