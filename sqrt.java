package febDsa;


/*
1)first n last occurrence of element in sorted array
2) intersection of two array
3)valid perfect square
4)square root of number
*All 4 question should be done using binary search
*
*/
public class sqrt {
	
  static int sqrts(int[] arr , int x) {
   int start=0;
   int end = x;
   int res =0;
   
   while(start<=end) {
	   int mid= start+(end-start)/2;
	   if(mid*mid==x) {
		   return mid;
	   }else if(mid*mid>x) {
		   end=mid-1;
		   res=mid;
	   }else {
		   start=mid+1;
	   }
   }
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr = {8,12,16,68,72,84};
	int x = 84;
	System.out.println(sqrts(arr,x));
	}

}
