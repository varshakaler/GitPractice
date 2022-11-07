package java_basic;

public class Examples {



    public static int FatherisHavingsomeshare_Google = 2000;


    public static String bankInterestrate(String bankName){

        String rate = null;

        if(bankName.equals("JPMC")){rate = "6.6%";}
        if(bankName.equals("WellsFargo")){rate = "8.6%";}
        if(bankName.equals("ICICI")){rate = "10.6%";}
        if(bankName.equals("SBI")){rate = "12.6%";}
        if(bankName.equals("HSBC")){rate = "16.6%";}
        return rate;
    }

}
