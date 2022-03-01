package febDsa;

public class FirstandLastOccurance {
	
	 public static int firstPosition(int arr[] , int target) {
	    	int start =0;
	    	int end = arr.length-1;
	    	int index = -1;
			
	    	while(start<=end) {
	    	int	mid = start+(end-start)/2;
	    	
	    	if(arr[mid]==target) {
	    		index= mid;
	    		end = mid-1;
	    	}else if(arr[mid]>target) {
	    		end=mid-1;
	    	}else {
	    		start=mid+1;
	    	}
	    	}
	    	return index;
	    }
	    public static int lastPosition(int arr[], int target) {
	    	int start =0;
	    	int end = arr.length-1;
	    	int index = -1;
			
	    	while(start<=end) {
	    	int	mid = start+(end-start)/2;
	    	
	    	if(arr[mid]==target) {
	    		index= mid;
	    		start= mid+1;
	    	}else if(arr[mid]>target) {
	    		end=mid-1;
	    	}else {
	    		start=mid+1;
	    	}
	    	
	    	}
	    	return index;
	    }
	    public static void main(String[] args) {
			// TODO Auto-generated method stub

		
		int[] arr = {1,2,2,3,3,4,4,4,5,6,7,8,8,9,10};
		
		int target = 8;
		
		
		int firstIndex = firstPosition(arr,target);
		int lastIndex = lastPosition(arr,target);
		int res = lastIndex-firstIndex+1;
		System.out.print(firstIndex + " ");
		System.out.println(lastIndex);
		System.out.println(res);
	   
	    }
	}

