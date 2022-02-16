package febDsa;

public class charArraySearch {
	
	public static  int searchChar(char[] arr, char target) {
		 int left = 0;
		    int right = arr.length;
		   
		    while(left<=right) {
		    	int mid = left+(right-left)/2;
		    	
		    	if(arr[mid]==target) {
		    		return mid;
		    	}else if(arr[mid]>target) {
		    		right=mid-1;
		    	}else {
		    		left=mid+1;
		    	}
		    	 
		    }
		   
		    return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 char[]	arr = {'a','b','d','e','f','g','h','i','x','z'};
	    char target = 'z';
	 
	    
      int  search =  searchChar(arr, target);
	   System.out.println(search);
	    
	}

}
