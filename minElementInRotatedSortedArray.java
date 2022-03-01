package febDsa;

public class minElementInRotatedSortedArray {
	
	
	static int findMin(int[] arr) {
		  if(arr.length==0) return -1;
		   if(arr.length==1) return arr[0];
		
		int low = 0;
		int high =arr.length-1;
		while(low<high) {
			int mid = low + (high-low)/2;
			
			if(arr[mid]>0 && arr[mid]<arr[mid-1]) {
				return arr[mid];
			}else if(arr[low]<=arr[mid] && arr[mid]>arr[high]) {
				return low = mid+1;
			}else {
				high= mid-1;
			}
		}
		
		
		return arr[low];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr = {1,3,5,0};
 
   
     System.out.println(findMin(arr));
     
	}

}
