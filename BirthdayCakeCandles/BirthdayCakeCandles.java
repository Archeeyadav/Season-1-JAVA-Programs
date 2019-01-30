import java.io.*;
import java.util.*;  
class Birthday
{  
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int count=0;
       
        int maxVal=0;
        int n; 
        n = scn.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = scn.nextInt();
      
            if(maxVal<ar[i])
            {
                maxVal=ar[i];
                count=0;
            }
             if(maxVal==ar[i])
            {
                count++;
            }

        }

        System.out.println(count);
   }
}   

