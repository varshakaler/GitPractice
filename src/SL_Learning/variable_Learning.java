package SL_Learning;

public class variable_Learning {

    int roll = 10;
    String bookName;


    public variable_Learning(){

        System.out.println("This is Constructor #############");
        this.bookName = "Let US C";
    }


    public static void main(String args[]) throws Exception{

        variable_Learning obj_1 = new variable_Learning();


        System.out.println(addition_numbers(10,20,20));
        System.out.println(FullName("Rahul" , "Dravid"));

        System.out.println("The Engineering C book Name is ==>"+ obj_1.bookName);


    }






    public  void Addition(){

        int empNo = 12345;

        System.out.println(roll);
        System.out.println(empNo);

    }

    public void Subs(){

        System.out.println(roll);
        //System.out.println(empNo);

    }

    public static int addition_numbers(int a , int b , int c){

        return a+b+c;

    }


    public static String FullName(String FName , String LName){


        return FName+" "+LName;

    }






}
