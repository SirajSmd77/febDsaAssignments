package febDsa;

public class selectionSort {
	
	
	static void selectionsort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int index = i;
			for(int j=1; j<arr.length; j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			
			int smallest = arr[index];
			arr[index]=arr[i];
			arr[i]=smallest;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr = {12,10,6,8,9,4,3};
	for(int i: arr) {
		System.out.print(i+" ");		
	}
	System.out.println();
	selectionsort(arr);
	for(int i: arr) {
		System.out.print(i+ " ");		
	}
 }

}
