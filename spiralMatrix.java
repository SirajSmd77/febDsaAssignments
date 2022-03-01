package febDsa;

public class spiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[][] arr = {{1,2,3,4},
			       {5,6,7,8},
		           {9,10,11,12},
			       {13,14,15,16}
		};
	
	int top=0;
	int left=0;
	int down = arr.length-1;
	int right = arr[0].length-1;
	int dir=0;
	
	while(top<=down && left <= right) {
		
	if(dir==0) {
		for(int i=left; i<=right; i++) 
			System.out.println(arr[top][i]);
			top++;
		
	}
	else if(dir==1) {
		for(int i=top; i<=down; i++)
			System.out.println(arr[i][right]);
			right--;
		}
		
	else if(dir==2) {
		for(int i=right; i>=left; i--)
			System.out.println(arr[down][i]);
			down--;
		}
	else if(dir==3) {
		for(int i=down; i>=top; i--)
			System.out.println(arr[i][left]);
			left++;
		}
		
		dir=(dir+1)%4;
	}
         System.out.println(arr);	
	}
}
