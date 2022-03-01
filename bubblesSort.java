package febDsa;

public class bubblesSort {

	 static void bubblesort(int[] arr) {
	    	
	    	int n = arr.length;
	    	
	    	for(int i=0; i<n-1; i++) {
	    		for(int j=0; j<n-i-1; j++) {
	    			if(arr[j]>arr[j+1]) {
	    				int temp = arr[j];
	    				arr[j]=arr[j+1];
	    				arr[j+1]=temp;
	    	    }
	         }
		
	      }
	   }
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		
		int[] arr = {15,12,13,16,18,8,7,6,2,1};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		} 
		  System.out.println();

	          bubblesort(arr);
	          for(int i=0; i<arr.length; i++) {
	      		System.out.print(arr[i]+" ");
	      	}
	          
		}

	}	