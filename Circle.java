import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		double a,b,m;
		
		System.out.print("Enter a point with two coordinates: ");
		a=input.nextInt();
		b=input.nextInt();
		
		m=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		if(m<=10)
			System.out.println("Point ("+a+","+b+") is in the circle");
		else
			System.out.println("Point ("+a+","+b+") is not in the circle");
	}

}
