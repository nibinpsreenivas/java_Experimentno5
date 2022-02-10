import java.util.*;
import java.io.*;
class fileprogram1
 { 
    public static void main(String args[])
     {
        int j=1;
        char ch;
        Scanner obj = new Scanner(System.in);
      
        try
        {
         
      
          FileInputStream fin = new FileInputStream("/home/nibin/file1.txt");
           System.out.println("\nContents of the file are");
                 int n=fin.available();
                 System.out.print(j+": ");
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)fin.read();
                                    System.out.print(ch);
                                    if(ch=='\n')
                                    {
                                                System.out.print(++j+": ");
                                               
                                    }
                         }            
                         
          }catch(IOException e)
              {
               System.out.println("file cannot be opened");
              } 
        
      }
  }                             
