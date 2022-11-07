package SL_Learning;

public class IF_ELSE {


    // First Learn IF-ELSE bock ...



     int  FIrst_Class = 800 ;
     int  Pass_Mark = 300 ;

    public static void main(String args[]) throws Exception{


        IF_ELSE obj = new IF_ELSE();

        obj.testStudent_Grade(299);

    }

    public  void testStudent_Grade(int Student_Marks){

        if (Student_Marks>=FIrst_Class){

            System.out.println("Congrats: You got First Class");

        }

        else if (Student_Marks<FIrst_Class && Student_Marks>Pass_Mark){

            System.out.println("Congrats: You got Second Class");
        }

        else{

            System.out.println("Sorry you Fail i the Exam ......");
        }


    }







}
