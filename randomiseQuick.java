import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
class main{

 public static void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
         randomise(arr,begin,end);
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
}
public static void randomise(int arr[],int l,int r){
Random rand= new Random();
int temp=rand.nextInt(r-l)+l;
int swap=arr[temp];
arr[temp]=arr[r];
arr[r]=swap;
}
public static  int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = begin;

    for (int j = begin; j < end; j++) {
        if (arr[j] <pivot) {
            

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
i++;

        }
    }
int swapTemp = arr[i];
    arr[i] = arr[end];
    arr[end] = swapTemp;

    return i;
}





public static void display(int arr[]){
int n=arr.length;
for(int i=0;i<n;i++)
System.out.println(arr[i]);
}


public static void main(String args[]){
int i,j,n;
Scanner sc=new Scanner (System.in);
n=sc.nextInt();
int arr[] =new int[n];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

quickSort(arr,0,n-1);
display(arr);
}
}