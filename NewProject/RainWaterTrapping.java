package NewProject;
import java.util.*;

//Brute Force Approach

public class RainWaterTrapping 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int left=0, right=0, res=0;
		for(int i=1;i<n-1;i++)
		{
			left=a[i];
			for(int j=0;j<i;j++)
			{
				left=Math.max(left, a[j]);
			}
			
			right=a[i];
			for(int k=i+1;k<n;k++)
			{
				right=Math.max(right, a[k]);
			}
			
			res+=Math.min(left, right)-a[i];
		}
		System.out.println(res);
	}
}
