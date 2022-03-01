package febDsa;

public class twoSum {
	
	
	
	static int TwoSum(int[] arr, int target) {
		int left=0;
		int right =arr.length-1;
		int index= -1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(arr[left]+arr[right]==target) {
	         System.out.println(+arr[left]+ ""+","+""+ arr[right]+")");
			}else if(arr[left]+arr[right]>target) {
				right--;
			}else {
				left++;
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {1,2,7,8,9,10};
     int target = 9;
     
     System.out.println(TwoSum(arr,target));
	}

}
