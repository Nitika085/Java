class ATM extends Thread{
  synchronized public void checkBalance(String name){
       System.out.println("Checking "+name);
       try {
           sleep(200);
       }
       catch (Exception e){
           System.out.println(e);
       }
       System.out.println("Balance");
   }
   synchronized public void withDraw(String name,int amount){
       System.out.println(name+ " withdrawing");
       try {
           sleep(200);
       }
       catch (Exception e){
           System.out.println(e);
       }
       System.out.println(amount);

   }

}
class customer extends Thread{
    ATM a;
    String name="";
    int amount;
    customer(String name,int amount,ATM a) {
        this.name = name;
        this.amount = amount;
        this.a=a;
    }
    void useATM(){
        a.checkBalance(name);
        a.withDraw(name,amount);
    }
    public void run(){
        useATM();
    }


}
/**
 * Method Description
 *
 * @return return description
 * @throws Exception when this exception occurs
 * @author nitik
 * @since 28-06-2025
 */
public class syncexample {
    public static void main(String[] args){
        ATM at=new ATM();
        customer c1=new customer("nitika",3000,at);
        customer c2=new customer("madhav",2000,at);
        c1.start();
        c2.start();


    }

}
