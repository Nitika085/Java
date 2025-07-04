package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class tokinizing {
    public static void main(String[] args) throws Exception {
        FileInputStream fs=new FileInputStream("C:\\Users\\nitik\\Documents\\Mytext.txt");
        byte[] b=new byte[fs.available()];
        fs.read(b);
        String str=new String(b);
//        String str="Gender=Female;Name=Madhika;Place=Baijnath;Rollno=21bcs085";
        StringTokenizer st=new StringTokenizer(str,"=,");
        String s;
        ArrayList<Integer> ar=new ArrayList<>();
        while(st.hasMoreTokens()){
            s=st.nextToken();
            ar.add(Integer.valueOf(s));
        }
        System.out.println(ar);

    }
}
