import java.util.*;
class main{
public static void main(String []args){
int n,k,sum=0,current=0,max=0;
Scanner sc=new Scanner (System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
k=sc.nextInt();
 for(int i=0;i<n-k+1 ;i++){
current=0;
for(int j=0;j<k;j++){
 current=current +arr[i+j];
}

 max=0;
max=Math.max(current,max);
}

System.out.println(""+max);
}
}
