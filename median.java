import java.util.*;
 class main{
public static void main(String[]args){
int i,j,n;
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++){
arr[i]=sc.nextInt();
}
sort(arr,n);
median(arr,n);
}

public static void sort(int arr[],int n){
for(int i=0;i<n;i++){
for(int j=1;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
}
public static void median(int arr[],int n){
float med=0;
if(n%2==1)
{
 System.out.println(arr[n/2]);
}
else{
med=(arr[n/2]+arr[(n/2)-1]);
}
 System.out.println(med/2);
}
}

 



