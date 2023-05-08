import java.io.*;
public class InputEx {
    public static void main(String[] args)
    {
        try{
    FileInputStream fos= new FileInputStream("C:/Users/user/OneDrive/Desktop/java/dineshM.txt");
    //byte[] b=new byte[fos.available()];
    int r;
    while((r=fos.read())!=-1)
    {
System.out.println((char)r);
    }
        }
   catch(Exception e)
   {
    System.out.println(e);
   }
    }
    
}
