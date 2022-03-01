package febDsa;

public class insertionSort {
	
	public static void insertionsort(int array[]) {  
        int n = array.length;  
        for (int i = 0; i < n; i++) {  
            int key = array[i];  
            int j = i-1;  
            while ( (j > -1) && ( array [j] > key ) ) {  
                array [j+1] = array [j];  
                j--;  
            }  
            array[j+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionsort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    
