import java.util.*;
import java.io.*;
class program4
 { 
     static String v;
    public static void main(String args[])
     {
        
        int n;
        int sum = 0;
        char ch;
        char s[] = new char[50];
        Scanner sc = new Scanner(System.in);
        try{
        
        FileInputStream fin = new FileInputStream("/home/s3c38/Desktop/NIBIN/cycle 5/Untitled Document");
           
                 int f=fin.available();
                        for(int i=0;i<f;i++)
                        {
                                    ch=(char)fin.read();
                                    s[i]=ch;
                        }
              v = String.valueOf(s); 
              fin.close(); 
           }catch(IOException e)
              {
               System.out.println("file cannot be opened");
              }                      
       try{                             
        StringTokenizer st = new StringTokenizer(v," ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            sum =sum+n;
            System.out.println(n);
           
        }
       }catch(NumberFormatException e)
         {
          System.out.println("sum of the integers is: " + sum);
         }
      }
 }
