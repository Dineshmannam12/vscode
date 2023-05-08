import java.io.*;
public class fileout {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream f= new FileOutputStream("C:/Users/user/OneDrive/Desktop/java/dineshM.txt");
        byte[] b={67,68,69,70,71,72,73};
        f.write(b);
    }
    
}
