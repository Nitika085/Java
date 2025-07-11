
class Addition {

    int x;
    int y;
    int z;
    public void sum(int x,int y){
        System.out.println(x+y);
    }
    public void sum(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public void display(){
        System.out.println("Add operation");
    }


}

class Math_operation extends Addition {

    int a;
    int b;
    int z;
    public void sub(int a,int b,int z){
        System.out.println(a-b-z);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }

    @Override
    public void display() {
//        super.display();
        System.out.println("maths operation");
    }
}


public class Polymorphism {


    public static void main(String[] args) {
        Addition a=new Addition();
        //method overloading
        a.sum(2,3);
        a.sum(2,4,6);
        a.display();
        Addition a1=new Addition();
        a1.x=2;
        a1.y=3;
        a1.z=4;
        a1.sum(a1.x, a1.y);
        Math_operation m=new Math_operation();
        m.sub(9,8);
        m.sub(5,6,7);
        m.display();
        m.sum(5,6,7);



    }
}