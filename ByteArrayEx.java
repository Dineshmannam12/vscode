import java.io.*;
public class ByteArrayEx {
    public static void main(String [] args) 
    {
        try{
  byte[] b={'a','b','c','d','e'};
  ByteArrayInputStream a=new ByteArrayInputStream(b);
  String s=a.readAllBytes();
  System.out.println(s);
  
}
catch(Exception e)
{
    System.out.println(e);
}

    }
    
}
