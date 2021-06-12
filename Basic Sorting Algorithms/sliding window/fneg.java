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
Deque<Integer>list= new LinkedList<>();
List<Integer>l=new ArrayList<>();
 while(j<n){
if(arr[j]<0){
list.add(arr[j]);
}

if(j-i+1<k){
j++;
continue; 
}


else if(j-i+1==k){
if(!list.isEmpty())
l.add(list.peek());
else
l.add(0);
if(arr[i]<0)
list.remove ();
i++;
}

j++;
}

System.out.println(""+l);

}
}
