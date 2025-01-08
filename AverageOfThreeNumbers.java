import java.util.*;
public class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number one :- ");
		int a = sc.nextInt();
		System.out.print("Enter the number two :- ");
		int b = sc.nextInt();
		System.out.print("Enter the number three :- ");
		int c = sc.nextInt();
		

		System.out.print("Average of three numbers is :- " + ( a+b+c) / 3 );

	}
	
}