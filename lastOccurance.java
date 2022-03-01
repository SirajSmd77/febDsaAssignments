package febDsa;

public class lastOccurance {
	
	static int lastOccur(int arr[] , int target) {
		int low = 0;
		int high = arr.length-1;
		int result = -1;
		
		while(low<=high) {
		int mid = low+(high-low)/2;
		
		if(arr[mid]==target) {
			result = mid;
			low=mid+1;
		}else if(arr[mid]>target) {
			high=mid-1;
		}else {
			low=mid+1;
		}
		
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {2,2,2,2,2,3};
		int target = 2;
		System.out.println(lastOccur(arr, target));
	}

}
