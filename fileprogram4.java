import java.util.*;
import java.io.*;
class fileprogram4
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
        
        FileInputStream fin = new FileInputStream("/home/nibin/file3.txt");
           
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
                                    
        StringTokenizer st = new StringTokenizer(v," ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
      }
 }
