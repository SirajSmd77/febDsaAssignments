package febDsa;

import java.util.HashMap;

public class intersectionOfarrays {

	/*public static void main(String[] args) {
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
*/
	
	private static void printIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
         
            if (map.containsKey(arr2[i])) {
                
                int freq = map.get(arr2[i]);
                freq--;                
                if (freq == 0) {
                    map.remove(arr2[i]);
                } else {
                    map.put(arr2[i], freq);
                }
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
    }
     public static void main(String[] args) {
        int arr1[] = new int[] {1, 2, 2, 1};
        int arr2[] = new int[] {2, 2};
        printIntersection(arr1, arr2);
      
    
}
}