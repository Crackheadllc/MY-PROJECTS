package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E6Exception {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(1);
        FileInputStream fis=null;
        //try{
           // FileInputStream fis = new FileInputStream("/Users/hustl3r/IdeaProjects/SDET22JavaBasics/Filesexceptions/Config.properties");} catch (
                //FileNotFoundException f) {
               // f.printStackTrace();
           // }finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


 //       System.out.println(2);
    }
//}






