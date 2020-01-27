import java.util.*;
public class RabinkarpAlgo {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0) {
	String str2=sc.next();
	String str1=sc.next();
	int n=str1.length();
	int m=str2.length();
    long k=(int)(1e9+7);
    long pr[]=new long[m+1];
    pr[0]=1;
    long p=79;
    for(int i=1;i<pr.length;i++) {
    	pr[i]=(pr[i-1]*p)%k;
    }
    long hs2=0;
    for(int i=0;i<m;i++) {
    	hs2=(hs2+(str2.charAt(i)*pr[m-i]))%k;
    }
    long hs1=0;
    for(int i=0;i<m;i++) {
    	hs1=(hs1+(str1.charAt(i)*pr[m-i]))%k;
    }int count=0;
    if(hs1==hs2) {
    	count++;
        }
   for(int i=
		   m;i<n;i++) {
	   hs1= (((hs1- str1.charAt(i-m)*pr[m]+ str1.charAt(i))*p)%k+k)%k;
    	if(hs1==hs2) {
    		count++;
   		}
   	}
    System.out.println(count);	
	t--;
	}
}
}
