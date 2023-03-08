class SwitchCarInventory 
{
	public static void main(String[] args) 
	{
		String component_name = "radiator";

		switch (component_name)
		{
		case "alternator":
			{
				System.out.println("Compartment A - Block 12");
				break;
			}
		case "front axle":
			{
				System.out.println("Compartment B - Block 1");
				break;
			}
		case "suspension":
			{
				System.out.println("Compartment D - Block 5");
				break;
			}
		case "battery cable":
			{
				System.out.println("Compartment C - Block 11");
				break;
			}
		case "radiator":
			{
				System.out.println("Compartment R - Block 12");
				break;
			}
		default:
			{
				System.out.println("Component Not Available");
			}
		}
	}
}
