import java.util.*;
public class CamelCaseToNormal
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String cword="";
		String fword="";
		String lword="";
		for(int i=0;i<s.length();i++)
		{
		    char ch=s.charAt(i);
		    if(Character.isUpperCase(ch)==true)
		    {
		        fword+=cword;
		        if(fword.length()>0)
		        {
		        fword+=" ";
		        }
		        int n=ch+32;
		        char ch2='\0';
		        ch2=(char)n;
		        cword=lword+ch2;
		    }
		    else{
		        cword+=ch;
		    }
		}
		fword+=cword;
		System.out.println(fword);
	}
}
