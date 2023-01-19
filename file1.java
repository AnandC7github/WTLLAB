import java.io.*;
import java.lang.*;
class file1
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream f1=new FileInputStream("demofile.txt");
            int i=f1.read();
            char c=(char)i;
            System.out.print(c);
            while(i!=1)
            {
                c=(char)i;
                System.out.print(c); 
            } 
        }catch(IOException e){System.out.print("Error"+e);}                                                              
    }
}