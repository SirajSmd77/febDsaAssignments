package febDsa;

public class recursiveFact {

	 public static int fact(int a){
	        if(a==1){
	            return 1;
	        }
	        else{
	            return fact(a-1)*a;
	        }
	   }
	    public static void main(String[] args) {
	        int a=5;
	        System.out.println(fact(a));
	 }
}
