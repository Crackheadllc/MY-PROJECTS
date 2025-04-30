package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1FileConfigFiles {
    public static void main(String[] args) throws IOException {
        String path="/Users/hustl3r/IdeaProjects/SDET22JavaBasics/Files/Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("url"));
    }
}
