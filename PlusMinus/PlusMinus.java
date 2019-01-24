import java.io.*;
import java.util.*;

class Plus
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
       int n,i;
        n = scn.nextInt();
        int arr[]=new int[n];
         float a= 0;float b = 0;float c= 0;
       
        for ( i = 0; i < n; i++)
        {
           arr[i]=scn.nextInt();
            if (arr[i] > 0)
            a++;
            else if (arr[i] < 0)
            b++;
            else
            c++;
        
      
        }
        System.out.println(""+a/n);
        System.out.println(""+b/n); 
        System.out.println(""+c/n); 
        /*System.out.println(""+n);*/
    }
}














