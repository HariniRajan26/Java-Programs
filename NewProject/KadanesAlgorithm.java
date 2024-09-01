package NewProject;
import java.util.*;

//Largest Sum Contiguous Subarray (Kadane’s Algorithm)

public class KadanesAlgorithm 
{
	
	public static void LSCS(int n, int a[])
	{
		int max_so_far=Integer.MIN_VALUE;
		int max_ending=0;
		int s=0,e=0,k=0; //Index
		
		for(int i=0;i<n;i++)
		{
			max_ending=max_ending+a[i];
			
			if(max_so_far<max_ending)
			{
				max_so_far=max_ending;
				s=k;
				e=i;
			}
			
			if(max_ending<0)
			{
				max_ending=0;
				k=i+1;
			}
			
		}
		
		System.out.println(max_so_far);
		System.out.println(s+" "+e);
		
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		LSCS(n,a);
	}
}
//7
//-2 -3 4 -1 -2 1 5 -3
