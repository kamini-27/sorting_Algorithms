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

ob.bubble(arr);
ob.display(arr);
}

void bubble(int arr[]){
int n=arr.length;
for(int i=0;i<n;i++)
for(int j=0;j<n-i-1;j++)
if(arr[j]>arr[j+1]){
int temp;
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}

void display(int arr[])
{int n=arr.length;
for(int i=0;i<n;i++)
System.out.println(arr[i]+"");
System.out.println();

}
}

