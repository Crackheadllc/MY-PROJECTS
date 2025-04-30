package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E7Exception {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(1);

        try(FileInputStream fis = new FileInputStream("/Users/hustl3r/IdeaProjects/SDET22JavaBasics/Filesexceptions/Config.properties")){
            } catch (IOException f){
            f.printStackTrace();
        }

        System.out.println(2);
    }
}






