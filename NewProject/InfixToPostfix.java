package NewProject;
import java.util.*;

public class InfixToPostfix 
{
	
	public static void postfix(String r) 
	{
		StringBuilder res=new StringBuilder ();
		Stack <Character> s=new Stack <> ();
		for(int i=0;i<r.length();i++)
		{
			char c=r.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				res.append(c);
			}
			else if(c=='(')
			{
				s.push(c);
			}
			else if(c==')')
			{
				while(!s.isEmpty() && s.peek()!='(')
				{
					res.append(s.pop());
				}
				s.pop();
			}
			else
			{
				while(!s.isEmpty() && (prec(c)<=prec(s.peek())) && asso(c)=='L')
				{
					res.append(s.pop());
				}
				s.push(c);
			}
		}
		while(!s.isEmpty())
		{
			res.append(s.pop());
		}
		System.out.println(res);
	}

	static int prec(char c) {
		if(c=='^')
		{
			return 3;
		}
		else if(c=='*' || c=='/')
		{
			return 2;
		}
		else if(c=='+' || c=='-')
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	static char asso(char c) {
		if(c=='^')
		{
			return 'R';
		}
		return 'L';
	}

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
		String r="a+b*(c^d-e)^(f+g*h)-i";
		postfix(r);
	}

}
