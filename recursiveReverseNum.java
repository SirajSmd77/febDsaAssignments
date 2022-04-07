package febDsa;

public class recursiveReverseNum {

	 public static void reverse(int num,String str){
	        if(num%10==0){
	            System.out.println(str);
	            return;
	        }
	        int rem=num%10;
	         str+= String.valueOf(rem);
	         num=num/10;
	         reverse(num,str);

	    }
	    public static void main(String[] args) {
	        int num=3456456;
	        String str="";
	        reverse(num,str);
	    }
	}
