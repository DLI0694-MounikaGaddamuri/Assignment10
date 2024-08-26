import java.util.*;
import java.lang.*;
class A extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(this.getName()+" "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadInterruption {
    public static void main(String[] args) throws InterruptedException {
               A thread=new A();
               thread.start();
               try {
                   thread.interrupt();
               }catch(Exception e){
                   System.out.println("Exception handled!");
               }

                System.out.println(thread.isInterrupted());
                System.out.println("Done!");

    }
}
