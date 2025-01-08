import java.util.*;
public class PowerCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Base:- ");
		int b = sc.nextInt();
		System.out.print("Enter the Exponent:- ");
		int e = sc.nextInt();
		
		System.out.print("Permeter of rectangle is :- " + ( Math.pow( b, e) ) );

	}
	
}