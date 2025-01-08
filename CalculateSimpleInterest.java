import java.util.*;
public class CalculateSimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle :- ");
		int p = sc.nextInt();
		System.out.print("Enter the rate:- ");
		int r = sc.nextInt();
		System.out.print("Enter the time:-  ");
		int t = sc.nextInt();
		System.out.print("Simple Interest is :- " + ( p * r * t )/100);

	}
	
}