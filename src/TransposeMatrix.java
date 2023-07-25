
public class TransposeMatrix {

	public static void main(String[] args) {
	int original[][] = {{2,5,6},{6,8,9},{1,0,4}};
	int transpose[] [] = new int[3][3];
	//Code to transpose a matrix  
	for(int i=0;i<3;i++){    
	for(int j=0;j<3;j++){    
	transpose[i][j]=original[j][i];  
	}    
	}    
	  
	System.out.println("Printing Matrix without transpose:");  
	for(int i=0;i<3;i++){    
	for(int j=0;j<3;j++){    
	System.out.print(original[i][j]+" ");    
	}    
	System.out.println();//new line    
	}    
	System.out.println("Printing Matrix After Transpose:");  
	for(int i=0;i<3;i++){    
	for(int j=0;j<3;j++){    
	System.out.print(transpose[i][j]+" ");    
	}    
	System.out.println();//new line    
	}    
	}}  



