import java.util.*;
public class Test {
	public static void main(String[] args) {
	    int arr[]= {1,2,4,9,10,13};
	    int l=0;
	    int h=arr.length-1;
	    int ans=0;
	    while(l<=h){
	     int mid=(l+h)/2;
	            if(arr[mid]>9){
	                h=mid-1;
	            }else{
	            	ans=arr[mid];
	                l=mid+1;
	            }
	        }
	      System.out.println(ans);
	    	
	    }
	}

