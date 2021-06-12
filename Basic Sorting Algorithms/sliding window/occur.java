import java.util.*;
class main{
public static void main(String args[]){
int i,n,j,count,ans=0;
Scanner sc=new Scanner (System.in);
String str1="";
String str2="";
str1=sc.nextLine();
str2=sc.nextLine();
int k=str2.length();
Map<Character,Integer>map= new HashMap<>();
for(int m=0;m<str2.length();m++){
char c=str2.charAt(m);
if(map.containsKey(c)){
map.put(c,map.get(c)+1);
}
else{
map.put(c,1);
}
}
count=map.size();
i=0;
j=0;
while(j<str1.length()){
char lc=str1.charAt(j);
if(map.containsKey(lc)){
map.put(lc,map.get(lc)-1);
if(map.get(lc)==0){
count--;
}
}
 if(j-i+1<k){
j++;
continue;
}
else if(j-i+1==k){
if(count==0){
ans++;
}
if(map.containsKey(str1.charAt(i))){
map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
if(map.get(str1.charAt(i))==1){
count++; 
}
}
i++;
j++;
}
}
System.out.println(""+ans);
}
}


