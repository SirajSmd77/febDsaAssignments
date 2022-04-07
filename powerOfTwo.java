package febDsa;

public class powerOfTwo {
	
	static boolean findPowerOfTwo(int num) {
		if(num==0) return false;
		
		while(num!=1) {
			if(num%2!=0) {
				return false;
			}
			else {
				num = num/2;
			}
		}
	
	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		if(findPowerOfTwo(32)) {
		System.out.println("yes power of 2 ");
		}else {
			System.out.println("not power of 2 ");	
		}
	}

}


/*
  public static int pow(int num,int pow){
        if(pow==1){
            return num;
        }
        else{
            return num*pow(num,pow-1);
        }
    }
    public static void main(String[] args) {
        int pow=5;
        int num=2;
        System.out.println(pow(num,pow));
    }
}
 */























