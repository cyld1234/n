import java.util.Scanner;
public class ISBN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int x=s.nextInt();
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		
		a1=x/100000000;
		a2=x/10000000%10;
		a3=x/1000000%10;
		a4=x/100000%10;
		a5=x/10000%10;
		a6=x/1000%10;
		a7=x/100%10;
		a8=x/10%10;
		a9=x%10;
		
		a10=(a1*1+a2*2+a3*3+a4*4+a5*5+a6*6+a7*7+a8*8+a9*9)%11;
		
		if(a10==10)
			System.out.println("The ISBN-10 number is "+a1+a2+a3+a4+a5+a6+a7+a8+a9+"X");
		else
			System.out.println("The ISBN-10 number is "+a1+a2+a3+a4+a5+a6+a7+a8+a9+a10);
		
		
	}

}
