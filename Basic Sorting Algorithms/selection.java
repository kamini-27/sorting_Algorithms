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

ob.selection(arr);
ob.display(arr);
}
void selection(int arr[]){
int n=arr.length;
int j;
for(int i=0;i<n-1;i++){
int min=arr[i];
int pos=i;
 for( j=i+1;j<n;j++){
 if(arr[j]<min){
min=arr[j];
pos=j;
}
}
if(pos!=i)
{
arr[pos]=arr[i];
arr[i]=min;
}
}
}
void display(int arr[]){
int n=arr.length;
System.out.println("sorted array");
for(int i=0;i<n;i++)
System.out.println( arr[i]);

}
}


