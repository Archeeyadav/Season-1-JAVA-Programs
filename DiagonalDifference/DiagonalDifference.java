import java.io.*;
import java.util.*;
import java.lang.*;
class Diagonal
{
    public static void main(String arg[])
    {
        Scanner scn = new Scanner(System.in);
        int a = 0, b = 0;
        int n = scn.nextInt();
      
        int A[][]= new int[n][n];
        
        for(int i=0;i<n;i++) 
        {  
        for(int j=0;j<n;j++)  
            {  
          A[i][j]=scn.nextInt();
        
            if(i==j)  
                a+=A[i][j]; 
            if(j==(n-i-1))  
                b+=A[i][j];  
              
            }  
        } 
        System.out.println(+Math.abs(a-b));
    }
}


