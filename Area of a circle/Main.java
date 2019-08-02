#include<stdio.h>
int main()
{
  int d;
  float r,p,a;
  scanf("%d",&d);
  p=3.14;
  r=(float)d/2;
  a=p*(r*r);
  printf("%.2f",a);
  return 0;
}