package febDsa;

public class binarySearch {
	
	static int firstIndex(int[] arr , int target) {
		int left = 0;
		int right = arr.length;
		int index = -1;
		
		 while(left<right) {
			int mid = left+(right-left)/2;
			
			if(arr[mid]==target) {
				index = mid ;
				  right=mid-1;
				  
			}else if(arr[mid]>target) {
				right=mid-1;
				
			}else {
				left=mid+1;
			}
		}
		
		return index;
		
	}
	static int LastIndex(int[] arr , int target) {
		int left = 0;
		int right = arr.length;
		int index = -1;
		
		 while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(arr[mid]==target) {
				index = mid ;
				  left=mid+1;
				  
			}else if(arr[mid]>target) {
				right=mid-1;
				
			}else {
				left=mid+1;
			}
		}
		
		return index;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[] =	{1,1,2,2,4,5,5,6,6,6,6,9,10,11};

	int target = 6;
	
	int firstOccurance = firstIndex(arr,target);
	System.out.println("first occurance of target elemnt   is at index  : "+firstOccurance);
	int lastOccurance = LastIndex(arr,target);
	System.out.println("last occurance of target elemnt   is at index  : "+lastOccurance);

	
	
	 int TotalfrequencyOccurance = lastOccurance-firstOccurance +1;
	 System.out.println("frequency of occurance of target elemnt   is at indexes : "+TotalfrequencyOccurance);
	}

}
