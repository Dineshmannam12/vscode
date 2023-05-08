public class Demos1 
{ public static void mul(int a,int b) throws Exception
    {
        int c=a/b;
        System.out.println("hi");
    }
    public static void main(String[] args)
    {
       try{
        mul(5,0);
       }
       catch(Exception exception)
       {
        System.out.println("hello");
       }
    }
    
}
