package LMS;

 class Course {
    String Course_Tittle;
    int Course_duration;
    boolean istrainer;

    public void Display_Course_Details(){
        System.out.println("Course Tittle:"+Course_Tittle);
        System.out.println("Course Duration in Months:"+Course_duration);
        System.out.println("Trainer assigeded or not:"+istrainer);
    }
    
}
