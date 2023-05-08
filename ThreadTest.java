public class ThreadTest extends Thread  {
   ThreadTest(String name)
   {
    super(name);
   }
public ThreadTest() {
}
public void run(){
   for (int i=0;i<6;i++)
   {
    System.out.println(Thread.currentThread().getName());
    if(i%2==0)
    {
    try{
    Thread.sleep(1000,2);

    System.out.println(i);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
   }
}
public static void main(String[] args)
{
    ThreadTest t=new ThreadTest("dinesh");
    ThreadTest t1=new ThreadTest();
    t.start();
    t.setPriority(10);
    System.out.println(t.getName());
    System.out.println(t.getPriority());
    System.out.println(t.getId());
    System.out.println(t.getState());
    System.out.println(ThreadTest.currentThread());
    for (int i=5;i<8;i++)
    {
        System.out.println(i);
    }
}
    
}
