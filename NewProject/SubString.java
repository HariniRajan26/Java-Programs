package NewProject;
import java.util.*;

public class SubString 
{
	public static int LSS(String a, String b, int n, int m)
	{
		int l[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(i==0 || j==0)
				{
					l[i][j]=0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1))
				{
					l[i][j]=l[i-1][j-1]+1;
				}
				else
				{
					l[i][j]=max(l[i-1][j],l[i][j-1]);
				}
			}
		}
		return l[n][m];
	}
	public static int max(int s,int r)
	{
		return (s>r)? s : r;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int n=a.length();
		int m=b.length();
		System.out.println(LSS(a,b,n,m));
	}
}
