import java.io.*;
import java.util.*;
class Students
{
    public static void main(String[]arg)
    {
        Scanner scn=new Scanner(System.in);
        int [] A = new int[3];
        int [] B = new int[3];
        int Alice =0, Bob = 0;
        for(int i=0;i<3;i++)
        {
            A[i] = scn.nextInt();
        }
         for(int i=0;i<3;i++)
        {
            B[i] = scn.nextInt();
        }
        for( int i=0;i<3;i++)
        {
            
            if(A[i]>B[i])
            Alice+=1;
            else if(A[i]<B[i])
            Bob+=1;
        }

        System.out.println(Alice+" "+Bob);

    }
}


