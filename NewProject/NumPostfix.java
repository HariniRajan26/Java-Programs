package NewProject;
import java.util.*;

public class NumPostfix {

	static int result(String s)
	{
		Stack <Integer> r=new Stack <Integer> ();
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(a==' ')
			{
				continue;
			}
			else if(Character.isDigit(a))
			{
				int n=0;
				while(Character.isDigit(a))
				{
					n=n*10+(a-'0');
					i++;
					a=s.charAt(i);
				}
				i--;
				r.push(n);
//				r.push(a-'0');
			}
			else
			{
				int n1=r.pop();
				int n2=r.pop();
				switch(a)
				{
				case '+':
					r.push(n2+n1);
					break;
				case '-':
					r.push(n2-n1);
					break;
				case '*':
					r.push(n2*n1);
					break;
				case '/':
					r.push(n2/n1);
					break;
				case '%':
					r.push(n2%n1);
					break;
				}
			}
		}
		return r.pop();
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s="22+15-2*7/3";
		System.out.println(result(s));
	}
}

