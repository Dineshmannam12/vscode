
class MyRunnable implements Runnable
{
    public void run()
    {
        int n=8;
        for(int i=0;i<=n;i++)
        { try{
            Thread.sleep(100);
            System.out.println("hello");
        }catch(Exception e){
            System.out.println("he");
        }
        }
    }
    public static void main(String[] args)
    {
        MyRunnable m= new MyRunnable();
        Thread t =new Thread(m);
        t.start();
        for(int i=0;i<6;i++){
            try{
                Thread.sleep(100);
                System.out.println("world");
            }catch(Exception e){
                System.out.println("he");
            }
        }
    }


    
}
