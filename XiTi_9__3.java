import java.util.Scanner;
import java.util.Date;
public class XiTi_9__3 {

	public static void main(String[] args) {
		long num=10000;
		Date date=new Date(num);
		System.out.println(date.toString());
		
		date.setTime(num*10);
		System.out.println(date.toString());
		
		date.setTime(num*100);
		System.out.println(date.toString());
		
		date.setTime(num*1000);
		System.out.println(date.toString());
		
		date.setTime(num*num);
		System.out.println(date.toString());
		
		date.setTime(num*num*10);
		System.out.println(date.toString());
		
		date.setTime(num*num*100);
		System.out.println(date.toString());
		
		date.setTime(num*num*1000);
		System.out.println(date.toString());

	}

}
