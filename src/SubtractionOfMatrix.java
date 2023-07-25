
public class SubtractionOfMatrix {

	public static void main(String[] args) {
		int a[][]={{2,4},{8,6}}; 
		int b[][]= {{1,9},{5,2}};
		int c[][] = new int[3][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
		}
		
		

	}

	}


