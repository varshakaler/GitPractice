package SL_Learning;

public class Class_A {



    public int roll = 10;
    public static String name = "Mithun";


    public static void main(String args[]) throws Exception{

        Class_A obj =  new Class_A();

        System.out.println("I am inside main Function");
        obj.doAddition();
        System.out.println("The Roll num is ==>"+obj.roll);
        System.out.println("The name is ==>"+name);

        Substra();


    }




    public void doAddition() {

        System.out.println("I am doing addition");

    }

    public static void Substra() {

        System.out.println("I am doing Subs");

    }








}
