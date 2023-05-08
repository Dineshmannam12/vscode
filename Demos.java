import java.io.FileInputStream;
import java.util.*;
public class  Demos
{
    
    public static int add() throws Exception
    {
       
        
      FileInputStream t=new FileInputStream("D:\\testout.txt");
      Scanner s=new Scanner(t);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=a/b;
      return c;


    }
    
    public static void main(String[] args)
    {
    try{
        add();
       }
    catch(Exception e)
      {
        System.out.println("hi dont try this way");
      }
    }


    
}