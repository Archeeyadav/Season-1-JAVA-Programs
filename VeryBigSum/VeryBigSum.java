import java.io.*;
import java.util.*;
import java.lang.*;
class Sum
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner (System.in);
        int i,n;
        long sum = 0;
        n=scn.nextInt();
        long a[]=new long[n];
       
        for (i = 0; i < n; i++)
        {
            a[i]=scn.nextInt();
            sum += a[i];
        }
        System.out.println(sum);
    }

}


