import java.util.Scanner;

public class shuzi2 {
    public static void main(String[] args) {
        int[] number =new int [101];
        Scanner input=new Scanner (System.in);
        int num;
        System.out.print("Enter the integers between 1 and 100:");
        do {
        	num=input.nextInt();
        	number[num]=number[num]+1;
        }
        while(num!=0);
        for(int i=1;i<number.length;i++) {
        	if(number[i]==1) {
        		System.out.println(i+" occurs "+number[i]+" time");
        	}else if(number[i]>1)
        		System.out.println(i+" occurs "+number[i]+" times");
        	
        }
    }
}
