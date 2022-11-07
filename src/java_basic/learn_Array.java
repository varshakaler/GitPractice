package java_basic;

public class learn_Array {


    public static void main(String args[]) throws Exception{
        //Learn_Int_Type_Array();
        Learn_String_Type_Array();
    }



    public static void Learn_Int_Type_Array(){

        // How to do Array declaration ...

        int[] num = {10,20,30,40,50,60,70,80,90};

        // 10 == 0 position , 20 = 1st position ....90 it is in 8th position ....

        // How to get length of the array ...

        int array_length = num.length;

        //System.out.println(array_length);

        for (int i = 1 ; i<array_length;i++){

           // System.out.println(i);
            System.out.println(num[i]);
        }

    }


    public static void Learn_String_Type_Array(){

        // How to do Array declaration ...

       String bankName[]  = new String[8];


       // Array initialization ...

        bankName[0] = "JPMC Bank";
        bankName[1] = "SBI Bank";
        bankName[2] = "PNB Bank";
        bankName[3] = "HSBC Bank";
        bankName[4] = "Duetsche Bank";
        bankName[5] = "Credit Sue Bank";
        bankName[6] = "ICICI Bank";
        bankName[7] = "HDFC Bank";


        for (int a = 0 ; a<bankName.length ; a ++){

            System.out.println(bankName[a]);
        }



    }
}
