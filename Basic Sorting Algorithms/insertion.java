import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class main{
public static void main(String args[]){
int i,j,n;
Scanner sc=new Scanner (System.in);
n=sc.nextInt();
int arr[] =new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
main ob=new main();

ob.insertion(arr,n);
ob.display(arr,n);
}

void insertion(int arr[],int n){
for(int i=1;i<n;i++){
 int j=i-1;
int t=arr[i];
while(t>=0&&arr[j]>t){
arr[j+1]=arr[j];
j--;
}
arr[j+1]=t;
}
}

void display(int arr[],int n){
//System.out.println("the sorted array is"); 
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}
