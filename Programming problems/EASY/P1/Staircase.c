#include <stdio.h> //header file
int main()         // main function
{
  int n, i, j; // initialisation
  
  scanf("%d", &n);         // read the value from user
  for (i = 1; i <=n; i++) // loop for number of lines
  {
    for (j = 0; j <n - i; j++) // loop for printing space
      printf(" ");               // print space
    for (j = 0; j <i; j++)     // loop for printing #
      printf("#");
    printf("\n"); // to print next line
  }
  return 0; // return statement
} // end of main
