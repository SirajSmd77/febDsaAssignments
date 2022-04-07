package febDsa;

public class recursiveMinandMax {

	public static void FindMinMax(int arr[],int a,int min,int max){
        if(a==arr.length){
            System.out.println(min);
            System.out.println(max);
            return;
        }
        if(arr[a]<min){
            min=arr[a];
        }
        if(arr[a]>max){
            max=arr[a];
        }
        a++;
       FindMinMax(arr,a,min,max);

    }
    public static void main(String[] args) {
        int arr[]={1,-1,0,2,-2,3,-3,4,-4};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        FindMinMax(arr,0,min, max);
    }
}
