import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConstestQ1 {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
            while(t>0){
                String str[]=sc.nextLine().split(" ");
                String str1=str[0];
                String str2=str[1];
                int count1[]=new int[26];
                int count2[]=new int[26];
                for(int i=0;i<str1.length();i++){
                    count1[str1.charAt(i)-'a']++;
                }
                for(int i=0;i<str2.length();i++){
                    count2[str2.charAt(i)-'a']++;
                }
                int ans=0;
                for(int i=0;i<26;i++){
                //	System.out.println(count1[i]+" "+count2[i]);
                    if(count1[i]!=count2[i]){
                        ans+=Math.abs(count1[i]-count2[i]);
                    }
                }
                System.out.println(ans);
            t--;
        }
    }
}