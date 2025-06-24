package LMS;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        LMSstudent s1=new LMSstudent();
        LMStrainer t1=new LMStrainer();
         s1.studentInfo();
        System.out.println(s1.sessionsAttendedCredits());

        System.out.println(s1.performanceScoreCredits());

        System.out.println(s1.achievementStatus());

         t1.trainerInfo();
         
        System.out.println(t1.totalPaymentForTrainer());

    }
    
}
