package LMS;

public class Studentinput {
    public static void main(String[] args) {
        studentcls First_Student=new studentcls();
        First_Student.Student_Name="JAHNAVI";
        First_Student.Student_id= 100338;
        First_Student.Student_age=21;
        First_Student.Phone_Number=7207848949l;
        First_Student.Course="JAVA FULL STACK";

        studentcls Second_Student = new studentcls();
        Second_Student.Student_Name="YOGA";
        Second_Student.Student_id=100025;
        Second_Student.Student_age=22;
        Second_Student.Phone_Number=939871231L;
        Second_Student.Course="AWS CLOUD";
        First_Student.Display_Student_class();
        System.out.println("====================================");
        Second_Student.Display_Student_class();
    }
    
}
