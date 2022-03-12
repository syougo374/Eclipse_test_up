
import java.util.Scanner;

public class BmiCalc2 {
	public static void main(String[] args) {
		double weight, height, bmi;
//		weight = 57;
//		height = 162;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("身長は :");
		height = stdIn.nextDouble();
		System.out.println("体重は :");
		weight = stdIn.nextDouble();
		height /= 100;
		bmi = weight / (height * 2);
		System.out.println(bmi);
		if ( bmi < 18.5) {
			System.out.println("痩せ気味です");
		}else if(bmi < 25) {
			System.out.println("標準です");
		}else {
			System.out.println("肥満です");
		}

	}

}
