public class ThreadEx extends Thread{
public void run()
{
    for(int i=0;i<8;i++)
    {
        System.out.println("hello");
    }
}
   public static void main(String [] args) 
   {
    ThreadEx n=new ThreadEx();
    n.start();
    for(int i=0;i<8;i++){
        System.out.println("world");
    }
   }
}
