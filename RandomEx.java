import java.io.*;
public class RandomEx {
    public static void main(String[] args) throws Exception
    {
    RandomAccessFile rf=new RandomAccessFile("C:\\Users\\user\\OneDrive\\Desktop\\java\\Dinesh123.txt","rw");
    System.out.println((char)rf.read());
    System.out.println((char)rf.read());
    System.out.println((char)rf.read());
    rf.write('d');
    System.out.println((char)rf.read());
    System.out.println((char)rf.read());
    rf.seek(3);
    System.out.println((char)rf.read());
    System.out.println((char)rf.read());
    }




}
