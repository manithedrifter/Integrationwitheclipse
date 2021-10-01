package Javaprograms;

public class patternpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=5;
		for(int i=1,k=n;i<=n;i++,k--)
		{
			
			int p=5;
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("");
				
				
			}

			for(int j=i;j<=n;j++)
			{
				System.out.print(p--+" ");
				
				
			}
			System.out.println();
			
		}

	}

}
