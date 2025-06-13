package CRM;

public class customerdiscount {
    public static void main(String[] args) {
        int customerId= 54907;
        String customerName="jahnavi";
        boolean isPremium=false;
        boolean is_Non_Premium=true;
        int yearsPartnership=5;
        String dealStage="Proposal";
        double dealValue= 10500.50;
        double baseDiscount=0.0;
        if (isPremium) {
            baseDiscount=0.1;
        }else if (is_Non_Premium && yearsPartnership >=3) {
            baseDiscount=0.05;
        }else{
            baseDiscount=0.0;
        }
        //double baseDiscount = (isPremium) ? 0.10 : (yearsPartnership >= 3 ? 0.05 : 0.0);
        double extraDiscount = 0.0;
        switch(dealStage){
            case "Proposal":
                extraDiscount += 0.02; 
                break;
            case "Negotiation":
                extraDiscount += 0.03; 
                break;
            case "Closed":
                extraDiscount += 0.05; 
                break;
            default:
                extraDiscount += 0;
        }

        double totalDiscount = baseDiscount + extraDiscount;
        double finalDealValue = dealValue * (1 - totalDiscount); 
        
        System.out.println("Customer ID       : " + customerId);
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Is Premium        : " + isPremium);
        System.out.println("Years of Partnership : " + yearsPartnership);
        System.out.println("Deal Stage        : " + dealStage);
        System.out.println("Original Deal Value : " + dealValue);
        System.out.println("Base Discount     : " + (baseDiscount * 100) + "%");
        System.out.println("Extra Discount    : " + (extraDiscount * 100) + "%");
        System.out.println("Total Discount    : " + (totalDiscount * 100) + "%");
        System.out.println("Final Deal Value  : " + finalDealValue);

    }
    
}
