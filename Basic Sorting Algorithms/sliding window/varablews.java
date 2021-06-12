import java.util.*;
class main{
public static void main(String args[]){
int n,sum=0,max=Integer.MIN_VALUE;
int k;
Scanner sc=new Scanner (System.in);
n=sc.nextInt();

int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
k=sc.nextInt();
int i=0;
int j=0;
while(j<n){
sum+=arr[j];
if(sum<k){
j++;
}
else if(sum==k){
max=Math.max(max,j-i+1);
j++;
}
else if (sum>k){
while(sum>k){
sum=sum-arr[i];
i++;
}
j++;
}
}
System.out.println(max);
}
}

