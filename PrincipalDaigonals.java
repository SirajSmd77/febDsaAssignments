package febDsa;

public class PrincipalDaigonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{6,5,4},
			       	  {4,2,6},
				      {8,8,4}
		            };
		
	    
		int row = arr.length;
		int col = arr[0].length;
	   int	presum=0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				if(i==j) {
					System.err.print(arr[i][j]+" ");
				  presum=presum+arr[i][j];
				}
			}
		}
		
		  System.out.println(presum);
		  
		System.err.println();
		int secSum=0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				if(i+j==row-1) {
					System.err.print(arr[i][j]+" ");
					secSum=secSum+arr[i][j];
				}
			}
		}
		  System.out.print(secSum);
		}

}
