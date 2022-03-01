package febDsa;

import java.util.Arrays;

public class sortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr = {0,2,2,1,1,0,0,2,1,2};
	
	int start = 0;
	int end = arr.length-1; 
	
	for(int i=0; i<=end; i++) {
		if(arr[i]==0) {
			int tempVar = arr[i];
			arr[i]=arr[start];
			arr[start]=tempVar;
			start++;
		}else if(arr[i]==2) {
			int tempVar=arr[i];
			arr[i]=arr[end];
			arr[end]= tempVar;
			end--;
			i--;
		}
	}
	 System.out.println("Sorted colors of an array is : " + Arrays.toString(arr));
	}

}
