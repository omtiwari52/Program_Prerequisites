import java.util.*;
public class CalculatePerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length :- ");
		int l = sc.nextInt();
		System.out.print("Enter the width:- ");
		int b = sc.nextInt();
		
		System.out.print("Permeter of rectangle is :- " + (2*( l + b ) ));

	}
	
}