import java.util.Scanner;
import java.util.GregorianCalendar;
public class XiTi_9_5 {

	public static void main(String[] args) {
		GregorianCalendar calendar=new GregorianCalendar();
		System.out.println("present year: "+calendar.get(calendar.YEAR));
		System.out.printf("present month: %d\n",calendar.get(calendar.MONTH)+1);
		System.out.println("present day: "+calendar.get(calendar.DAY_OF_MONTH));
		
		calendar.setTimeInMillis(1234567898765L);
		System.out.println(calendar.get(calendar.YEAR)+":"+calendar.get(calendar.MONTH)+":"+calendar.get(calendar.DAY_OF_MONTH)+":");
		
	}

}
