/*
 * 
 * find the missing elements in the array
 * 
 */
package pgm;

public class missingElements 
{

	public static void main(String[] args) {
		int[] a= {30,35,37,40};
		missing(a);
	}

	public static void missing(int[] a) {
		for (int i = 0; i < a.length; i++)
		{
			for (int j =a[i]+1;j<a[i+1];j++)
			{
			System.out.println(j);	
			}
		}
		
	}

}
