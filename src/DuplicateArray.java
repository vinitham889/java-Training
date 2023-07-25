
public class DuplicateArray {
	   public static void main (String[] args) {  
	        int arr[] = {10,20,20,30,30,40,50,50,10};  
	        int length = arr.length;  
	        int[] temp = new int[length];  
	        int p=0;
	        boolean flag = false;
	        for (int i=0; i<length; i++) {
	         flag = false;
	          if( i == 0){
	          temp[p] = arr[i];
	          p++;
	          }else{
	          for (int j=0; j<temp.length; j++){
	          if(temp[j] == arr[i] ){
	          flag = true;
	          }
	          }
	          if(!flag){
	          temp[p] = arr[i]; 
	          p++;
	          }
	          }
	        } 
	        for (int i=0; i<temp.length; i++)  
	            System.out.print(temp[i]+" ");
	        
	    }  
	}


