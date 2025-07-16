import java.util.Locale;

interface Mylambda1{
    public void display(String str);
}

public class lambdaexp2 {


    public  void reverse(String str){
        StringBuffer s=new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
    public  lambdaexp2(String str){
        System.out.println(str.toUpperCase());



    }
    public static void main(String[] str) {
        Mylambda1 ml = lambdaexp2::new;
        ml.display("Hello");
    }
}
