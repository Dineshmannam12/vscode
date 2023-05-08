public class ThreadEx extends Thread{
     ThreadEx(String name){
        super(name);
     }
public void run()
{
   
    //System.out.println(Thread.currentThread().getName());
}
   public static void main(String [] args) 
   {
    ThreadEx n=new ThreadEx("ny name");
    n.start();
    System.out.println(Thread.currentThread());
    
   
   }
}
