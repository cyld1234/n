import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
	
		int h,q,m,j,k,year,month;
		System.out.print("Enter year: ");
		year=input.nextInt();
		System.out.print("Enter month: 1-12: ");
		month=input.nextInt();
		System.out.print("Enter the day of the month: ");
		q=input.nextInt();
		
		
		
		if(month==1) {
			m=13;
			year=year-1;
		}
		else if(month==2) {
			m=14;
		year=year-1;
		}
		else
			m=month;
		j=year/100;
		k=year%100;
		
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		
		switch(h) {
		case 0:
			System.out.println("Day of the week is Saturday");
			break;
		case 1:
			System.out.println("Day of the week is Sunday");
			break;
		case 2:
			System.out.println("Day of the week is Monday");	
			break;
		case 3:
			System.out.println("Day of the week is Tuesday");
			break;
		case 4:
			System.out.println("Day of the week is Wednesday");
			break;
		case 5:
			System.out.println("Day of the week is Thursday");
			break;
		case 6:
			System.out.println("Day of the week is Friday");
			break;
			
				}
	}

}
