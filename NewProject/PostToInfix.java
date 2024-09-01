package NewProject;
import java.util.*;

public class PostToInfix 
{
	
	public static void infix(String s) 
	{
		Stack <String> r=new Stack <> ();
		for(int i=0;i<s.length();i++)
		{
			if(isOperand(s.charAt(i)))
			{
				r.push(s.charAt(i)+"");
			}
			else
			{
				String o1=r.peek();
				r.pop();
				String o2=r.peek();
				r.pop();
				r.push("("+o2+s.charAt(i)+o1+")");
			}
		}
		for(String i:r)
		System.out.println(i);
	}
	
	public static boolean isOperand(char a) 
	{
		if(a>='a' && a<='z' || a>='A' && a<='Z')
		{
			return true;
		}
		return false;
	}

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		infix(s);
	}

}
