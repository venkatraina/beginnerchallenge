#include<stdio.h>
void main(){
int n,c=0;
while(n!=0){
n/=10;++c;}
printf("The digits of integer %d is :%d",n,c);
}