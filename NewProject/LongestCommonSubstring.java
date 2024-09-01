package NewProject;
import java.util.*;

public class LongestCommonSubstring 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String x="GeeksforGeeks";
		String y="GeeksQuiz";
		LCS(x,y);
	}

	public static void LCS(String x, String y) 
	{
		int n=x.length();
		int m=y.length();
		int res=0,end=0,cr=0;
		int len[][]=new int[2][n];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				if(i==0 || j==0)
				{
					len[cr][j]=0;
//					System.out.print(len[cr][j]+" ");
				}
				else if(x.charAt(i-1)==y.charAt(j-1))
				{
					len[cr][j]=len[1-cr][j-1]+1;
					if(len[cr][j]>res)
					{
						res=len[cr][j];
						end=i-1;
					}
//					System.out.print(len[cr][j]+" ");
				}
				else
				{
					len[cr][j]=0;
//					System.out.print(len[cr][j]+" ");
				}
			}
//			System.out.println(res+" "+end);
//			System.out.println(cr);
			cr=1-cr;
		}
		if(res==0)
		{
			System.out.println(-1);
		}
		System.out.println(x.substring(end-res+1, res));
	}
}
