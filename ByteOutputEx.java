import java.io.*;
public class ByteOutputEx {
    public static void main(String[] args) throws Exception
    {
       byte[] b={'a','b','c','d','f'};
        ByteArrayOutputStream a=new ByteArrayOutputStream();
        a.write(b);
        a.writeTo(new FileOutputStream("C:/Users/user/OneDrive/Desktop/java/dineshM.txt"));
        a.close();

    }
}
