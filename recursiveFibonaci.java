package febDsa;

public class recursiveFibonaci {

	 public static int fibonacci(int a){
	        int result=0;
	        if(a==0 || a==1){
	            result=1;
	        }
	        else{
	          result=fibonacci(a-1)+fibonacci(a-2);
	        }
	        return result;
	    }
	    public static void main(String[] args) {
	        int a=10;
	        for(int i=0;i<a;i++){
	            System.out.print(fibonacci(i)+" ,");
	        }

	    }
	}