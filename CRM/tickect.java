package CRM;

public class tickect {
    public static void main(String[] args) {
          String CustomerName="Sagar";
           String Customer_Email="sagar.12@gmail.com";
          int customerid=8946;
          short tickectNumber=35;
          String issue="network not connecting to the device"  ;
          String issue_RaisedDate="23/11/24";
          boolean isIssueCleared = true;

          System.out.println("\n=== Support tickets ===");
          System.out.println("CustomerName: " + CustomerName);
          System.out.println("Customer_Email: " + Customer_Email);
          System.out.println("Customer ID: " + customerid);
          System.out.println("tickectNumber : " + tickectNumber);
          System.out.println("what is the issue: " +  issue);
          System.out.println("issue_RaisedDate: " + issue_RaisedDate);
          System.out.println("is the issue is cleared?: " + isIssueCleared);
    }
    
}
