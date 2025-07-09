/**
 * Whiteboard class represents a shared resource between teacher and students
 * for message communication in a synchronized manner.
 */
class whiteboard{
String text;
int noStudents=0;
int count=0;

/**
 * Increments the number of students attending the class.
 */
public void attendance(){
 noStudents++;
}

/**
 * Writes a message to the whiteboard in a synchronized manner.
 * Teacher writes the message and notifies all waiting students.
 * 
 * @param msg the message to be written on the whiteboard
 */
synchronized public void writemsg(String msg){
 System.out.println("Teacher is writing "+msg);
   /**
    *
    */
 while (count!=0){
  try {
   wait();
  }
  catch (Exception e){}
 }
 text=msg;
 count=noStudents;
 notifyAll();
}
synchronized public String read(){
 while (count==0){
  try {
   wait();
  }
  catch (Exception e){}

 }
 String s=text;
 count--;
 if(count==0)notifyAll();
 return s;
}



}

/**
 * j
 */
 class teacher extends Thread{
 whiteboard w;
 String[] msg={"Java is language,","it is platform independent", "it has multithreading feature","end"};
 public teacher(whiteboard wt){
  w=wt;
 }

 public void run(){
  for(int i=0;i<msg.length;i++){
   w.writemsg(msg[i]);
  }


 }


}
class student extends Thread{
 whiteboard w;
 String name;
 student(String s,whiteboard w1){
  name=s;
  w=w1;
 }


 public void run(){
  String text;
  w.attendance();
  do {
   text=w.read();
   System.out.println(name+" Reading "+text);
   System.out.flush();

  }while (!text.equals("end"));

 }
}




 class teacherStudent {
 public static void main(String[] args){
  whiteboard wb=new whiteboard();
  teacher t=new teacher(wb);
  student s1=new student("1. Nitika",wb);
  student s2=new student("1. MAdhav",wb);
  student s3=new student("1. arya",wb);
  student s4=new student("1. jassi",wb);
  t.start();
  s1.start();
  s2.start();
  s3.start();
  s4.start();

 }


}
