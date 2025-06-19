package LMS;

public class Coursein {
    public static void main(String[] args) {
        Course Course_1 =new Course();
        Course_1.Course_Tittle="Java Full Stack";
        Course_1.Course_duration=4;
        Course_1.istrainer=true;

        Course Course_2 = new Course();
        Course_2.Course_Tittle="Python Full Stack";
        Course_2.Course_duration=3;
        Course_2.istrainer=true;

        Course Course_3 = new Course();
        Course_3.Course_Tittle="Devops";
        Course_3.Course_duration=6;
        Course_3.istrainer=false;
        Course_1.Display_Course_Details();
        System.out.println("--------------------------");
        Course_2.Display_Course_Details();
        System.out.println("--------------------------");
        Course_3.Display_Course_Details();
        System.out.println("--------------------------");
    }
    
}
