package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
//        p.put("Name", "Nitika");
//        p.put("Place", "Baijnath");
//        p.put("Rollno", "21bcs085");
//        p.put("Gender", "Female");
//
//        
//        p.store(new FileOutputStream("C:\\Users\\nitik\\Documents\\Mytext.properties"), "Details");

        p.load(new FileInputStream("C:\\Users\\nitik\\Documents\\Mytext.txt"));
        System.out.println(p.getProperty("Name"));
    }
}
