public class exceptionhandling {
    public static void main(String[] args){
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println("c");
        }
        catch(ArithmeticException e){
            System.out.println("Denominatior is 0 "+e);

        }
        System.out.println("bye");

        int[] A={10,0,3,4,5};
        try{
        int c=A[0]/A[1];
            System.out.println(c);
            System.out.println(A[10]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


    }
}
