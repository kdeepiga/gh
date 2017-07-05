package code;
import java.util.Scanner;
public class LeapYearOrNot {
public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year:");
		year=s.nextInt();
		if((year%400==0)||(year%4==0)&&(year%100!=0)){
			System.out.println("it is a leap year");
		}
		else{
			System.out.println("it is not a leap year");
			
		}
	}

}
