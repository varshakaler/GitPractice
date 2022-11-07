package java_basic;

public class Learn_Custom_Throw_Exception {


    public static void main(String args[]) {


        Learn_Custom_Throw_Exception obj = new Learn_Custom_Throw_Exception();
        obj.Delhi_Public_School_Admission(9);
    }




    public void Delhi_Public_School_Admission(int Student_Age) {


        if (Student_Age > 10) {

            throw new ArithmeticException("Sorry your Kid is not eligible for the Admission");
        }

        if (Student_Age < 10) {

            System.out.println("Welcome to Delhi Public School");
        }
    }






}
