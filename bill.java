public class bill {
    public static void main(String[] args) {
        String invoice_No = "DSHIV000935";
        String Date_time = "14-06-2025 15:14pm";
        String Customer_name = "Adarsh";
        long Customer_Number= 7569794990l;
        String sales_man ="sai";
        // one item
        byte sr_no= 1;
        int HSN_CODE_1 = 62034200;
        long SKU_1 =8905836025352l;
        String item_desc_1 ="Mens/cargos";
        float MRP_1=1599.00f;
        float Discount_1=465.13f;
        float discount_1=29.09f;
        float Taxable_value_1 =1012.39f;
        float  Tax_value_1 = 121.48f;
        float  Net_Value_1 = MRP_1 - Discount_1;
        float  sgst=6.00f;
        float  Utgst = 60.74f;
        // 2nd item
        byte sr_no_2= 1;
        int HSN_CODE_2 = 6205200;
        String SKU_2 ="STDLMS24020_MV_S";
        String item_desc_2 ="Mens/Casual Shirts";
        float MRP_2=1699.00f;
        float Discount_2=494.22f;
        float discount_2=29.09f;
        float Taxable_value_2 =1075.70f;
        float  Tax_value_2 = 129.08f;
        float  Net_Value_2 = MRP_2 - Discount_2;
        float  sgst_2=6.00f;
        float  Utgst_2 = 60.54f;
        // 3rd item
        byte sr_no_3= 1;
        int HSN_CODE_3 = 62034200;
        String SKU_3 ="DLMSHJAS24014_NV_S";
        String item_desc_3 ="Mens/Causual Shirts";
        float MRP_3=2199.00f;
        float Discount_3=639.66f;
        float discount_3=29.09f;
        float Taxable_value_3 =1392.26f;
        float  Tax_value_3 = 167.08f;
        float  Net_Value_3 = MRP_3 - Discount_3;
        float  sgst_3=6.00f;
        float  Utgst_3= 83.54f;
        int Total_item_only = sr_no + sr_no_2 + sr_no_3;
        float Grosss_Bill_value= MRP_1 + MRP_2 + MRP_3;
        float Item_discount_Amount = MRP_1;
        float Tax_Amount = Tax_value_1+Tax_value_2+Tax_value_3;
        float Net_Bill_Amount=Net_Value_1+Net_Value_2+Net_Value_3;
        float Total_Invoice_Value=Net_Bill_Amount;
       // DISPLAY BILL

        System.out.println("===MENSA BRAND TECHNOLOGIES PVT LTD===");
        System.out.println("---------------------------------------");
        System.out.println("====TAX INVOICE====");
        System.out.println("---------------------------------------");
        System.out.println("Inovice no            :"+invoice_No);
        System.out.println("Inovice date/time     :"+Date_time);
        System.out.println("Customer Name         :"+Customer_name);
        System.out.println("Customer Number       :"+Customer_Number);
        System.out.println("--------------------------------------------");
        System.out.println("sr 1: " + sr_no + ", HSN CODE: " + HSN_CODE_1 + ", SKU: " + SKU_1);
        System.out.println("item description: " + item_desc_1 + ", sales man: " + sales_man);
        System.out.println("MRP: " + MRP_1 + ", Discount_Price: " + Discount_1 + ", Tax_Valuable: " + Taxable_value_1);
        System.out.println("TAX_VALUE: " + Tax_value_1 + ", NET_VALUE: " + Net_Value_1);
        System.out.println("discount %: " + discount_1 + ", sgst: " + sgst + ", ugst: " + Utgst);
        System.out.println("--------------------------------------------");
        System.out.println("sr 2: " + sr_no_2 + ", HSN CODE: " + HSN_CODE_2 + ", SKU: " + SKU_2);
        System.out.println("item description: " + item_desc_2 + ", sales man: " + sales_man);
        System.out.println("MRP: " + MRP_2 + ", Discount_Price: " + Discount_2 + ", Tax_Valuable: " + Taxable_value_2);
        System.out.println("TAX_VALUE: " + Tax_value_2 + ", NET_VALUE: " + Net_Value_2);
        System.out.println("discount %: " + discount_2 + ", sgst: " + sgst_2 + ", ugst: " + Utgst_2);
        System.out.println("--------------------------------------------");
        System.out.println("sr 3: " + sr_no_3 + ", HSN CODE: " + HSN_CODE_3 + ", SKU: " + SKU_3);
        System.out.println("item description: " + item_desc_3 + ", sales man: " + sales_man);
        System.out.println("MRP: " + MRP_3 + ", Discount_Price: " + Discount_3 + ", Tax_Valuable: " + Taxable_value_3);
        System.out.println("TAX_VALUE: " + Tax_value_3 + ", NET_VALUE: " + Net_Value_3);
        System.out.println("discount %: " + discount_3 + ", sgst: " + sgst_3 + ", ugst: " + Utgst_3);
        System.out.println("--------------------------------------------");
        System.out.println("TOTAL ITEM ONLY       :"+Total_item_only);
        System.out.println("GROSS BILL VALUE      :"+Grosss_Bill_value);
        System.out.println("ITEM DISCOUNT AMOUNT  :"+Item_discount_Amount);
        System.out.println("TAX AMOUNT            :"+Tax_Amount);
        System.out.println("NET BILL AMOUNT       :"+Net_Bill_Amount);
        System.out.println("TOTAL INVOICE VALUE   :"+Total_Invoice_Value);
        System.out.println("--------------------------------------------");
        System.out.println("========THANK YOU VISIT AGAIN=========");
    }
}
