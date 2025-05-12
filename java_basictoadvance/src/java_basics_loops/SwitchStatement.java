package java_basics_loops;

//import java.util.Scanner;

public class SwitchStatement {
	public static void main(String args[]) {
		//switch case
		int a=1;
		switch(a) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("not applicable");
		}

		//------------------------------------------------------------------------------------------
		// updated version
		int day = 3; // You can change this value to test other cases

		String result = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day";
		};

		System.out.println("Day " + day + ": " + result);

		//--------------------------------------------------------------------------
		//-> if we are using this there is no need to use break 
		String day0 ="Monday";
		switch(day0) {
		//		case "Saturday", "Sunday"-> System.out.println("6am");
		//		case "Monday" -> System.out.println("8am");
		//		default -> System.out.println("7am");
		case "saturday", "sunday"-> result = "6am";
		case "Monday" -> result = "8am";
		default -> result = "7am";
		}
		System.out.println(result);

		//--------------------------------------------------------
		String day1 = "sunday";
		String result1 = "";

		result1 = switch (day1) {
		case "saturday", "sunday" -> "6am";
		case "monday" -> "8am";
		default -> "7am";
		};

		System.out.println(result1);

		//----------------------------X----------------------------------------------
		//old one
		//		Scanner scanner = new Scanner(System.in);
		//		System.out.print("Enter a number (1-7): ");
		//		int n = scanner.nextInt();
		//		scanner.close(); 
		int n=2;
		if(n == 1)
			System.out.println("Monday");
		else if(n == 2)
			System.out.println("Tuesday");
		else if(n == 3)
			System.out.println("Wednesday");
		else if(n == 4)
			System.out.println("Thursday");
		else if(n == 5)
			System.out.println("Friday");
		else if(n == 6)
			System.out.println("Saturday");
		else
			System.out.println("Sunday");	

	}
}
