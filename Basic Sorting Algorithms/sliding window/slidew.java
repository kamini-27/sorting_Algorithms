import java.util.*;
class main{
public static void main(String []args){
int n,k,i,j=0,sum=0,max=0;
Scanner sc=new Scanner (System.in);
n=sc.nextInt();
int arr[]=new int[n];
for( i=0;i<n;i++){
arr[i]=sc.nextInt();
}
k=sc.nextInt();
i=0;
j=0;
 while(j<n){
sum=sum+arr[j];
if(j-i+1<k){
j++;
continue;
}
else if(j-i+1==k){
max=Math.max(max,sum);
}

sum=sum-arr[i];

i++;

j++;
}

System.out.println(""+max);
}
}
