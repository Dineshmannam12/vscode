import java.io.*;
public class BufferEx {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fos=new FileInputStream( "C:/Users/user/OneDrive/Desktop/java/dineshM.txt");
        BufferedInputStream b=new BufferedInputStream(fos);
       System.out.println((char)b.read());
       System.out.println((char)b.read());
       System.out.println((char)b.read());
       b.mark(10);
       System.out.println((char)b.read());
       System.out.println((char)b.read());
       b.reset();
       System.out.println((char)b.read());
       System.out.println((char)b.read());


    }
    
}
