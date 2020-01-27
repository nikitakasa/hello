import java.util.*; 
import java.io.*;
class Solution { 
    public static void main (String[] args)  throws Exception
    {       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        boolean p[]=new boolean[1000001];
        Arrays.fill(p,true);
        p[0]=false;
        p[1]=false;
        for(int i=2;i<=1000;i++) {
            if(p[i]==true) {
               for(int j=i;j<=1000000;j++) {
            	   p[j*i]=false;
               }
            }
        }
        while(t>0) {
            String str[]=br.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            int count=0;
            for(int i=a;i<=b;i++) {
                if(p[i]) {
                    count++;
                }
            }
           bw.write(count+"\n");
            t--;
        }
        bw.flush();
    }
} 