import java.util.*;
class main{
public static void main(String [] args){
Scanner sc=new Scanner (System.in);
String s=sc.nextLine();
int n=sc.nextInt();
HashMap<Character,Integer>map =new HashMap<>();
int maxlen=Integer.MIN_VALUE;
int i=0;
int j=0;
int count=0;
while(j<s.length()){
 for(int m=0;m<s.length();m++){
char c=s.charAt(m);
if(map.containsKey(c)){
map.put(c,map.get(c)+1 );
}
else{
map.put(c,1);
}
j++;
}
if(map.size()<n){
j++;
}
else if (map.size()==n){
maxlen=Math.max(maxlen,j-i+1);
j++;
}
else if (map.size()>n){
while(map.size()>n){
char lc=s.charAt(i);
map.put(lc,map.get(lc)-1);
if(map.get(lc)==0){
map.remove(lc );
i++;
}
}
j++;
}
}
System.out.println(maxlen);
}
}

   

