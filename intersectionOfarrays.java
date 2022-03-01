package febDsa;

public class intersectionOfarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {2,4,6,8,9,3,2};
		int[] arr2 = {9,7,5,3,2,5,4};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j] + " ");
				}
			}
		}	
	}

}
