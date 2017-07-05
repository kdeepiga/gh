package guvi;
import java.util.Scanner;
public class EvenNumbersBetweenTwoInterval {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int n=a;n<=b;n++){
			if(n%2==0){
				System.out.println("the even number is"+n);
			}
		}
		
	}

}
