#include<stdio.h>
void main(){
int a,b,c;
printf("enter the values of a,b&c:");
scanf("%d%d%d",&a,&b,&c);
if(a>b&&a>c)
  printf("The value %d is largest",a);
else if(b>a&&b>c)
  printf("The value %d is largest",b);
else
  printf("The value %d is largest",c); 
}