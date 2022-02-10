import java.util.*;
import java.io.*;
class fileprogram3
 { 
    public static void main(String args[])
     {
        int countl=0,countc=0,countw=0;
        char ch;
        Scanner obj = new Scanner(System.in);
        try
        {
           FileWriter writer = new FileWriter("/home/nibin/file2.txt");
           System.out.println("enter the name");
           String s = obj.nextLine();
           writer.write("name:");
           writer.write(s);
           writer.write('\n');
           System.out.println("enter the address");
           writer.write("address:");
           String a = obj.nextLine();
           writer.write(a);      
           writer.close();              
                         
          }catch(IOException e)
              {
               System.out.println("file cannot be opened");
              } 
         try
        {
         
      
          FileInputStream fin = new FileInputStream("/home/nibin/file2.txt");
           System.out.println("\nContents of the file are");
                 int n=fin.available();
                
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)fin.read();
                                    System.out.print(ch);
                         }            
                         
                         fin.close();   
          }catch(IOException e)
              {
               System.out.println("file cannot be opened");
              }
      
      }
  }                             
