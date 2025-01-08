import java.util.*;
public class CelsiusToFahrenhiet{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter The Temperature In Celsius:-");
		int temperature = sc.nextInt();
		int tempFahrenheit = temperature * 9/5 + 32;
		System.out.print("Temperature In Fahrenheit :-"+ tempFahrenheit  );

	}
}