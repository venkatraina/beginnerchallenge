#include<stdio.h>
int main(void){
int n;
scanf("%d",&n);
if((n/2)*2==n)
  printf(" %d is even number",n);
else
  printf(" %d is odd number",n);
}