import java.util.*;
class main{
public static void main(String [] args){
Scanner sc=new Scanner (System.in);
String s=sc.nextLine();
HashMap<Character,Integer> map=new HashMap<>();
int i=0;
int j=0;
int k;
int current=0,maxlen=0;
while(j<s.length()){
for(int m=0;m<s.length();m++){
 char c=s.charAt(m);
if(map.containsKey(c)){
map.put(c,map.get(c)+1);
}
else{
map.put(c,1);
}
j++;
}
k=j-i+1;
if(map.size()==k){
maxlen=Math.max(maxlen,k);
j++;
}
else{
while(map.size()<k){
char lc=s.charAt(i);
map.put(lc,map.get(lc)-1);
if(map.get(lc)==0)
map.remove(lc );
i++;
k--;
}
if(map.size()==k){
maxlen=Math.max(maxlen,k);
}
}
j++;

}
System.out.println(maxlen);
}
}

   




 

