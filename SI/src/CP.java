import java.io.*;
public class CP {
	public static void main(String args[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0) {
			String s[]=br.readLine().split(" ");
		     int n=Integer.parseInt(s[0]);
		     int k=Integer.parseInt(s[1]);
		     int arr[]=new int[n];
		     String str[]=br.readLine().split(" ");
		     int sum=0;
		     for(int i=0;i<str.length;i++) {
		    	 arr[i]=Integer.parseInt(str[i]);
		    	 sum=sum+arr[i];
		     }
		     Cabinetp(arr,k,sum);
			t--;
		}
	}

	private static void Cabinetp(int[] arr, int k,int sum) {
		int l=0;
		int h=sum;
		int ans=0;
		  while(l<=h) {
		  int mid=(l+h)/2; 
		  if(isvalied(arr,mid,k)) {
			  ans=mid;
			  h=mid-1;
		  }else {
			  l=mid+1; 
			  }
		  }
		System.out.println(ans);
	}

	private static boolean isvalied(int[] arr, int mid,int k) {
		int sum=0;
		int p=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(mid+" "+sum);
			if(arr[i]>mid) {
				return false;
			}
			if(sum>mid) {
				sum=arr[i];
				p++;
			}
			else
				sum=sum+arr[i];
		}
		if(p>=k) {
			return false;
		}else {
			return true;
		}
	}
}
