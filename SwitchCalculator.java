import java.util.Scanner;
class SwitchCalculator
{  
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number 1 : ");
		int n1 = sc.nextInt();

		System.out.println("Enter Number 2 : ");
		int n2 = sc.nextInt();

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int o = sc.nextInt();

		switch (o)
		{
		case 1:
			{
				System.out.println("Addition is :"+ (n1+n2) );
				break;
			}
		case 2:
			{
				System.out.println("Subtraction is :"+ (n1-n2) );
				break;
			}
		case 3:
			{
				System.out.println("Multiplication is :"+ (n1*n2) );
				break;
			}
		case 4:
			{
				System.out.println("Division is :"+ (n1/n2) );
				break;
			}
		}
	}
}
