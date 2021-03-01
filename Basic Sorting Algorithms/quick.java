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

ob.display(arr);
ob.quickSort(arr,0,n-1);
}

public void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
}

private int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }
int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;

    return i+1;
}

void display(int arr[]){
int n=arr.length;
for(int i=0;i<n;i++)
System.out.println(arr[i]);
}
}