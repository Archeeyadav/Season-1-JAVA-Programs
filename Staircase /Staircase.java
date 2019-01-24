import java.io.*;
import java.util.*;
class Staircase
{
    public static void main(String[]arg)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=1,j=0;
        for (i = 1; i <= n; i++) // loop for number of lines
    {
        for (j = 0; j < n - i; j++) // loop for printing space
        System.out.print(" ");              // print space
        for (j = 0; j < i; j++)     // loop for printing #
         System.out.print("#");
   
        System.out.println(); // to print next line
    }



    }
}

