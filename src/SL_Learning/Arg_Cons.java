package SL_Learning;

public class Arg_Cons {



    int eid;
    String EName;


    public Arg_Cons(int Employee_id , String Employee_Name){


        this.eid = Employee_id;
        this.EName = Employee_Name;

    }

    public void EmpTableInfo(){

        System.out.println("ID="+eid + ",Name="+EName);
    }

    public static void main(String args[])throws Exception{

        Arg_Cons obj = new Arg_Cons(222 , "Sachin");
        obj.EmpTableInfo();

    }




}
