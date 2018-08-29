import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	int num1,num2;
	Scanner van=new Scanner(System.in);
	System.out.println("Enter any numbers");
	num1=van.nextInt();
	System.out.println("Enter Second numbers ");
	num2=van.nextInt();

	System.out.println("CHOOSE(1.ADD,2.SUB,3.MUL,4.DIV");
	int result=van.nextInt();
	switch(result)
	{
	case 1:
	result=num1+num2;
	System.out.println("ADDITION TWO NUMBERS IS:"+result);
	break;
	case 2:
		result=num1-num2;
		System.out.println("SUBTRACTION:"+result);
		break;
	case 3:
		result=num1*num2;
		System.out.println("MULTIPLiCATION:"+result);
		break;
	case 4:
		result=num1%num2;
		System.out.println("DIVISION:"+result);
		break;
		default:
			System.out.println("WRONG");
	}

	}

}
