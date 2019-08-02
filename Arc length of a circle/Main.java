#include<stdio.h>
#include<math.h>
int main()
{
  float arc,a,r,p;
  scanf("%f%f",&a,&r);
  p=3.14;
  arc = 2*p*r*(a/360);
  printf("%.2f",arc);

  return 0;
}