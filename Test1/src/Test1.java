import java.util.Scanner;
public class Test1 {
     
	public static void main(String[] args) {
		int num1,num2,result;
		Scanner van=new Scanner(System.in);
		System.out.print("Enter 1st no.:");
		num1=van.nextInt();
		System.out.print("Enter 2nd no.:");
		num2=van.nextInt();
		//result=van.nextInt();
		result=num1+num2;
		System.out.println("ADDITION OF TWO NUMBERS IS-->"+result);
		
		
	}

}
