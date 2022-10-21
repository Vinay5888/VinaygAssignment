package assignament;

public class question1 {

	public static void main(String[] args) {
		
		int n=10;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==0 || i==n-1 || j==n/2 && i>0 && i<n-1) // for alphabet I
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{
				if(j==0 || j==n-1 || i==j) // for alphabet N
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{
				if(i==0 && j>0 || i==n/2 && j>0 || i==n-1 && j>0 || j==0 ) // for alphabet E
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{
				if(j==0 && i<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i<n-1  ) // for alphabet U
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{
				if(j==0 && i>0 || i==0 && j<n-1 || j==n-1 && i>0 && i<n/2 || i==n/2 && j<n-1   || i==j && j>n/2 ) // for alphabet R
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{
				if(i==0 && j>0 && j<n-1 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1  || j==n-1 && i>0 && i<n-1 ) // for alphabet O
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
			
			for(int j=0; j<n; j++)
			{
				if(j==0 && i>0 || j==n-1 && i<n-1 || i==j ) // for alphabet N
				{
				    System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("   ");
		}

	}

}
