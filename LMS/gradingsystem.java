package LMS;

public class gradingsystem {
    public static void main(String[] args) {
        String Student_Name = "jahnavi";
        int student_id = 32478;
        String Grade = "7th Grade";
        byte Age = 12;
        int Telugu_Marks = 22;
        int Hindi_Marks = 95;
        int Science_Marks = 50;
        int total_marks = Telugu_Marks + Hindi_Marks + Science_Marks;
        int average = total_marks / 3;
        boolean ispass = average>=50;
        boolean isqualified = Telugu_Marks >= 30 && Hindi_Marks >= 30 && Science_Marks >= 30 && average >= 50;

        System.out.println("Student Name:"+ Student_Name);
        System.out.println("Student id:"+ student_id);
        System.out.println("Grade:"+ Grade);
        System.out.println("Age:"+ Age);
        System.out.println("Telugu Marks:"+ Telugu_Marks);
        System.out.println("Hindi Marks:"+ Hindi_Marks);
        System.out.println("Science Marks:"+ Science_Marks);
        System.out.println("Average Marks:"+ average);
        System.out.println("Result:"+ isqualified);

    }    
}
