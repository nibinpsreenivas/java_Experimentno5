import java.util.*;
import java.io.*;
class program2
 { 
    public static void main(String args[])
     {
        int countl=0,countc=0,countw=0;
        char ch;
        Scanner obj = new Scanner(System.in);
      
        try
        {
           FileInputStream fin = new FileInputStream("/home/nibin/file1.txt");
           System.out.println("\nContents of the file are");
                 int n=fin.available();
                 
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)fin.read();
                                    countc++;
                                    if(ch=='\n')
                                     countl++;
                                    if(ch == '\n'||ch==' ')
                                     countw++;
                         }   
                         System.out.println("NUMBER OF LINE:"+countl);
                         System.out.println("NUMBER OF CHARACTER:"+countc);
                         System.out.println("NUMBER OF WORDS:"+countw);         
                         
          }catch(IOException e)
              {
               System.out.println("file cannot be opened");
              } 
        
      }
  }                             
