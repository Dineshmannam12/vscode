import java.io.*;
class Student
{
    int rollno;
    String name;
    String dept;
}

public class Writer
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fi=new FileOutputStream("C://User//user//onedrive//Desktop//java//mytxt.java");
        PrintStream p=new PrintStream(fi);
        Student s=new Student();
        s.rollno=4;
        s.name="dinesh";
        s.dept="ece";
        p.println(s.rollno);
        p.println(s.name);
        p.println(s.dept);
        System.out.println("hi");
    }
}