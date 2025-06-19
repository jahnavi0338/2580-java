package LMS;

public class Trainerinput {
 public static void main(String[] args) {
    trainer First_Trainer=new trainer();
    First_Trainer.Trainer_Name="ADARSH";
    First_Trainer.Trainer_ID=2135;
    First_Trainer.Email="adarsh@gmail.com";
    First_Trainer.Experience=3;
    First_Trainer.Number_of_Course=2;

    trainer Second_Trainer=new trainer();
    Second_Trainer.Trainer_Name="Shiva";
    Second_Trainer.Trainer_ID=4532;
    Second_Trainer.Email="shiva@gmail.com";
    Second_Trainer.Experience=2;
    Second_Trainer.Number_of_Course=1;
    First_Trainer.Display_Trainer_details();
    System.out.println("------------------------------");
    Second_Trainer.Display_Trainer_details();




    
 }
}
