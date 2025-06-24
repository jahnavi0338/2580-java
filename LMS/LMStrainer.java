package LMS;

import java.util.Scanner;

class LMStrainer {
    int Trainer_id;
    String Trainer_name;
     int session_Taken;
    int Per_SessionCost;
    int total_Payment;
    Scanner sc = new Scanner(System.in);
    public void trainerInfo() {
        
        System.out.println("----------TRAINER DETAILS----------");
         System.out.print("Enter Trainer ID: ");
        Trainer_id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Trainer Name: ");
        Trainer_name = sc.nextLine();
        
    }
     public int trainerPaymentCal(){
       
        System.out.println("Enter Number Of Sessions Taken");
        int numberOfSession_Taken = sc.nextInt();
        int session_BasedPayment = numberOfSession_Taken * 1500;
        return session_BasedPayment;
    }
      public int totalPaymentForTrainer(){
       
        LMSstudent s1 = new LMSstudent();
        int bouns=s1.trainer_Ratings();
        int totalPaymentForTrainer = trainerPaymentCal() + bouns;
        return totalPaymentForTrainer;
    }
}
