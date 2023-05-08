public class MultiThreads extends Thread {
    
       public void run()
       {
        for(int i=0;i<8;i++)
        {
       try{
        Thread.sleep(2000);
        System.out.println(i);
          }
       catch(Exception e)
         { 
        System.out.println(e);
        }
       }
    }
    

    public static void main(String[] args)
    {
      
        // Number of threads
       
            MultiThreads object
                = new MultiThreads();
           object.start();
    }
}

