package febDsa;

public class findGcdTwoNum {

	 public static void gcd(int divisor,int divident){
	        if(divident%divisor==0){
	            System.out.println(divisor);
	            return;
	        }
	        gcd(divident%divisor,divisor);
	       // return divisor;
	    }
	    public static void main(String[] args) {
	        int a=4;
	        int b=8;
	        gcd(a,b);
	    }
	}