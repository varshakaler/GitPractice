package test;

public class looping_for {


    public static void main(String args[]) throws Exception{



        StringTypeArray();



    }



    public static void StringTypeArray(){


        String[] cars = {"Maruti" , "TATA" , "AUDI" , "BMW" , "FIAT"};


        System.out.println(cars[1]);


        int lengthofmycars = cars.length;


        for(int i=0;i<lengthofmycars;i++){


            System.out.println(i);
            System.out.println(cars[i]);


            //System.out.println("The car with Index==>"+i+" "+"is"+" "+"===>"+cars[i]);


        }

    }







}
