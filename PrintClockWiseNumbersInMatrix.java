package pgm;

public class PrintClockWiseNumbersInMatrix {

	public static void main(String[] args) {
		int a[][]=new int[4][4];
		int count=1;
		for (int start=0,end=a.length-1;start<end;start++,end--)
		{
			for(int i=start;i<end;i++)
			{
				a[start][i]=count++;
			}
			for(int i=start;i<end;i++)
			{
				a[i][end]=count++;
			}
			for(int i=end;i>start;i--)
			{
				a[end][i]=count++;
			}
			for(int i=end;i>start;i--)
			{
				a[i][start]=count++;
			}
		}
		if(a.length%2!=0)
			a[a.length/2][a.length/2]=count++;
		
		System.out.println("the array elements are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
