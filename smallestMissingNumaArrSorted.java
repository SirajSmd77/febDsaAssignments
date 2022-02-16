package febDsa;

public class smallestMissingNumaArrSorted {
	
	static int findMissingElemnt(int[] arr ) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=i) {
				return i;
			}
			
		}
		return arr.length;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {0, 1, 2, 6, 9, 11, 15};            // Output: The smallest missing element is 3
		
		System.out.println(findMissingElemnt(nums1));

		int nums2[] = {1, 2, 3, 4, 6, 9, 11, 15};          // Output: The smallest missing element is 0 .
		System.out.println(findMissingElemnt(nums2));
	    int nums3[] = {0, 1, 2, 3, 4, 5, 6};    
	    System.out.println(findMissingElemnt(nums3));        // Output: The smallest missing element is 7
	}

}
