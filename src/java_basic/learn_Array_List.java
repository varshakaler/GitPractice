package java_basic;

import java.util.ArrayList;

public class learn_Array_List {


    public static void main(String args[]) throws Exception{

        learn_Array_List obj = new learn_Array_List();

        obj.LearnArrayList();
    }


    public void LearnArrayList(){


        ArrayList<String> obj = new ArrayList<String>();

        ArrayList<Integer> obj1 = new ArrayList<Integer>();


        obj.add("Project Management Certification Course");
        obj.add("Cyber Security Certification Course");
        obj.add("Data Science Certification Program");
        obj.add("Data Analytics Certification Program");
        obj.add("Business Analysis Certification Course");
        obj.add("Digital Marketing Certification Program");
        obj.add("Lean Six Sigma Certification Course");
        obj.add("Cloud Computing Certification Course");
        obj.add("Data Engineer Certification Program");
        obj.add("AI and Machine Learning Course");
        obj.add("Full Stack Web Development Course");
        obj.add("Digital Marketing Bootcamp");

        // Ho to display ArrayList Data ????

        System.out.println(obj);


        // To Add some data in an ArrayList

        obj.add(3 ,"Mithun Teaching Java");

        System.out.println(obj);


        // To Delete some data in an ArrayList

        obj.remove(3);

        System.out.println(obj);



        // Iterating ArrayList ...

        for (String str:obj){
            System.out.println(str);
            if(str.equalsIgnoreCase("Business Analysis Certification Course1")){
                break;
            }
        }






        obj1.add(123);
        obj1.add(222);
        obj1.add(333);
        obj1.add(555);
        obj1.add(777);
        obj1.add(444);

        obj1.add(4 , 999);
        System.out.println(obj1);














    }








}
