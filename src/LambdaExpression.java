interface Mylambda{
    public void display();
//    public int add(int x,int y);
}
class useLambd{
    public void callambda(Mylambda ml){
        ml.display();
    }

}


public class LambdaExpression {
    public static void main(String[] args){
        useLambd l=new useLambd();
        l.callambda(()-> System.out.println("hello"));
    }

}
