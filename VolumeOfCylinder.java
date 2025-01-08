import java.util.*;
public class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter The Radius:- ");
		int radius = sc.nextInt();
		System.out.print("Enter The Height:- ");
		int height= sc.nextInt();
		System.out.print("Volume Of Cylinder Is "+( 3.14*radius*radius*height ));

	}
}