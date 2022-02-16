package febDsa;

public class FindindexOfNumtobeInsertedSOrtedArray {
	
	  static int findIndexToinsert(int[] arr,int target) {
		  
		  int i=0;
		  while(i<arr.length) {
			  
			  if(arr[i]==target) {
				  return i;
			  }else if(arr[i]>target) {
				  return i;
			  }else {
				  i++;
			  }
			
			  
		  }
		  
		  return arr.length;
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[] arr = {1,3,5,6};                                   // target = 2 Output: 1 
    int target = 2;
    
   System.out.println(findIndexToinsert(arr,target));
	//int[] nums1 = {1,3,5,6};                                    //  target = 7 Output: 4
	
	
	}

}
