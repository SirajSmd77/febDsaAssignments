package febDsa;

public class recursiveEvenNum {

	 public static void evenNosInDecreasingOrder(int n){
	        if(n==0){
	            return;
	        }
	        if(n%2==0){
	            System.out.print(n+" ");
	        }
	        n--;
	       evenNosInDecreasingOrder(n);
	    }
	    public static void main(String[] args) {
	        int n=10;
	        evenNosInDecreasingOrder(n);
	    }
	}
