#include <stdio.h>
int main()
{
	int i,Alice=0,Bob=0,a0,a1,a2; 
	printf("Enter elements:");
	scanf("%d %d %d",&a0,&a1,&a2);
	int b0,b1,b2; 
	scanf("%d %d %d",&b0,&b1,&b2);
	int A[3],B[3];
	A[0]=a0;
	A[1]=a1;
	A[2]=a2;
	B[0]=b0;
	B[1]=b1;
	B[2]=b2;
	for( i=0;i<3;i++)
		{
			if(A[i]>B[i])
			Alice=1;
			else if(A[i]<B[i])
			Bob=1;
		}
	printf("%d %d",Alice,Bob);
        
	return 0;
}

