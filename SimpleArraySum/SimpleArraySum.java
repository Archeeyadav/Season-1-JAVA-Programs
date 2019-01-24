import java.io.*;
import java.util.*;

     class Summation

    {

        public static void main(String[] args) 

        {

            int n, sum = 0;

            Scanner scn = new Scanner(System.in);

        

            n = scn.nextInt();

            int a[] = new int[n];

            

            for(int i = 0; i < n; i++)

            {

                a[i] = scn.nextInt();

                sum = sum + a[i];

            }

            System.out.println(""+sum);

        }

    }
