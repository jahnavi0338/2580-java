package LMS;

 class trainer {
    String Trainer_Name;
    int Trainer_ID;
    String Email;
    byte Experience;
    int Number_of_Course;

    public void Display_Trainer_details(){
            System.out.println("Trainer Name :"+Trainer_Name);
            System.out.println("Trainer ID :"+Trainer_ID);
            System.out.println("Trainer Experince :"+Experience);
            System.out.println("Number of Courses Taught :"+Number_of_Course);
    }
}
