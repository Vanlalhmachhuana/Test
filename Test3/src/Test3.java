import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner van=new Scanner(System.in);
		boolean isValue=false;
		System.out.println("Enter any character's:");
	//	boolean isValue=false;
		char ch=van.next().charAt(0);
		switch(ch)
		{
		case 'a': case 'e': case 'i': case 'o': case 'u':

		case 'A': case 'E': case 'I': case 'O': case 'U':
			isValue=true;
		}
		if(isValue==true)
			System.out.println("VOWEL");
		
		else if((ch>='a'&&ch<='z')||ch>='A'&&ch<='Z')
			System.out.println("CONSONANT");
		else
			System.out.println("WRONG INPUT");
			
	}

	}
