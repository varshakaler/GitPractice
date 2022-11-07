package java_basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example_ThrowsException {


    public static void main(String args[]){

        try{
            searchForFile();
        }catch(IOException e){
            System.out.println(e);
        }
    }


    public static void searchForFile() throws IOException{

        //File newFile = new File("/Users/mithunroy/IdeaProjects/junitformaven/ABCD.txt"); // This will not throw any error ...
        File newFile = new File("ABCD.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }


}
