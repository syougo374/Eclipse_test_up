import java.util.Scanner;

public class DisplayMonth {

	public static void main(String[] args) {
		final String [] MONTH = {"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "Nobember", "December" };
		
		Scanner scanner = new Scanner(System.in);
//		int month = scanner.nextInt();
//		switch(month) {
//		case 1:
//			System.out.println("January");
//			break;
//		case 2:
//			System.out.println("February");
//			break;
//		case 3:
//			System.out.println("March");
//			break;
//		case 4:
//			System.out.println("April");
//			break;
//		default:
//			break;
//		}
		
		
		
		
		try {
			System.out.println(MONTH[scanner.nextInt()]);
		} catch (Exception e) {
			System.out.println("入力値が間違っています");
		}
	}

}
