package LMSstring;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        
       Student s1 = new Student();
         s1.studentID=101;
         s1.studentName="jahnavi";

        // complete details --> Constructor Overloading
        Student s2 = new Student(101, "jahnavi",90909090,25,"hi i have a promo with me",30000);

        s1.studentInfo();
        s2.studentCompleteInfo();

        System.out.println(s1.achievementStatus());
        s2.calculateCourseFee();

        Trainer t1 = new Trainer(10231, "Krishna");
        

        t1.trainerInfo();
       
        System.out.println(t1.totalPaymentForTrainer());

    }


}