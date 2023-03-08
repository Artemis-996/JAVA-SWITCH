import java.util.Scanner;
class Hotel
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("**********WELCOME**********");

		System.out.println("1. VEG");
		System.out.println("2. NON VEG");

		int ip = sc.nextInt();

		switch (ip)
		{
		case 1:
			{
				System.out.println("1.DOSA ----> 70.00 Rs  :");
				System.out.println("2.PARATHA ----> 50.00 RS  : ");
				System.out.println("3.PANEER BUTTER MASALA ----> 80.00 RS  : ");
				System.out.println("4.ROTI ----> 7.00 RS  : ");
				int ip1 = sc.nextInt();
				switch (ip1)
				{
				case 1:
					{
						System.out.println("Quantity : ");
						int qty = sc.nextInt();
						System.out.println("You will have to pay :"+" "+ (qty*70)+" Rs "+" "+"for"+" "+qty+" "+"Dosa");
						break;
					}
				case 2:
					{
						System.out.println("Quantity : ");
						int qty = sc.nextInt();
						System.out.println("You will have to pay :"+" "+ (qty*50)+" Rs "+" "+"for"+" "+qty+" "+"Paratha");
						break;
					}
				case 3:
					{
						System.out.println("Select Quantity");
						System.out.println("1. Half ---> 80 Rs");
						System.out.println("2. Full ---> 150 Rs");
						int qty = sc.nextInt();
						switch (qty)
						{
						case 1:
							{
								System.out.println("You will have to pay :"+" "+80+" Rs "+" "+"for"+" "+"half"+" "+"PBM");
								break;
							}
						case 2:
							{
								System.out.println("You will have to pay :"+" "+150+" Rs "+" "+"for"+" "+"full"+" "+"PBM");
								break;
							}
						}
						break ;
					}
				case 4:
					{
						System.out.println("Quantity : ");
						int qty = sc.nextInt();
						System.out.println("You will have to pay :"+" "+ (qty*7)+" Rs "+" "+"for"+" "+qty+" "+"Roti");
						break;
					}	
				}
			}
		case 2:
			{
				System.out.println("1.CHICKEN TIKKA ----> 150.00 Rs  :");
				System.out.println("2.CHICKEN BIRYANI ----> 160.00 RS  : ");
				System.out.println("3.CHICKEN MASALA ----> 200.00 RS  : ");
				System.out.println("4.ROTI ----> 7.00 RS  : ");
				int ip1 = sc.nextInt();
				
				switch (ip1)
				{
				case 1:
					{
						System.out.println("Quantity : ");
						int qty = sc.nextInt();
						System.out.println("You will have to pay :"+" "+ (qty*150)+" Rs "+" "+"for"+" "+qty+" "+"CHICKEN TIKKA");
						break;
					}
				case 2:
					{
						System.out.println("Quantity : ");
						int qty = sc.nextInt();
						System.out.println("You will have to pay :"+" "+ (qty*160)+" Rs "+" "+"for"+" "+qty+" "+"CHICKEN BIRYANI");
						break;
					}
				case 3:
					{
						System.out.println("1. Half ---> 110 Rs");
						System.out.println("2. Full ---> 200 Rs");
						int qty = sc.nextInt();
						switch (qty)
						{
						case 1:
							{
								System.out.println("You will have to pay :"+" "+ (qty*110)+" Rs "+" "+"for"+" "+"Half"+" "+"CHICKEN MASALA");
								break;
							}
                        case 2:
							{
								System.out.println("You will have to pay :"+" "+ (qty*200)+" Rs "+" "+"for"+" "+"Full"+" "+"CHICKEN MASALA");
								break;
							}
						
						}
						break;
					}
				case 4:
					{
						System.out.println("Quantity : ");
						int qty = sc.nextInt();
						System.out.println("You will have to pay :"+" "+ (qty*7)+" Rs "+" "+"for"+" "+qty+" "+"ROTI");
						break;

					}
				}
				break;
			}
			default :
			{
				System.out.println("Invalid Input");
			}
	
		}

	 }


}
