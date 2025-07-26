
class Student5{

    private int age;
    public void setAge(int Age){
        this.age=Age;
    }

    public int getAge() {
        return age;
    }
}
class Animal{
    void sound(){
        System.out.println("Animal make sound!");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks!");
    }

}
class Cal{

    int add(int a,int b){return a+b;}
    double add(double a,double b){
        return a+b;
    }

}



public class Example {
    public static void  main(String[] args){
        Student5 s=new Student5();
        s.setAge(7);
        System.out.println(s.getAge());
        Dog d=new Dog();
        d.sound();
        d.bark();
        Cal c= new Cal();
        System.out.println(c.add(8,0));
    }

}
