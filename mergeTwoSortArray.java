package febDsa;

import java.util.Arrays;

public class mergeTwoSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr1 = {2,4,6,7,8,9};
	int[] arr2 = {10,12,14,15,18,19};
	int[] arr3 = new int[arr1.length+arr2.length];
	
	int i=0 , j=0, k=0;
	
	while(i<arr1.length && j<arr2.length) {
		if(arr1[i]<arr2[j]) {
			arr3[k]=arr1[i];
			k++;
			i++;
		}else {
			arr3[k]=arr2[j];
			k++;
			j++;
		}
	}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			k++;
			j++;
		 
		 
		}
	
		 System.out.println(Arrays.toString(arr3));
	
}

}
