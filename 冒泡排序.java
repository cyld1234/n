import java.util.Scanner;
public class ð������ {
    public static void main(String[] args) {
        //ð�������㷨
    	Scanner input=new Scanner(System.in);
		int[] numbers=new int[10];
		System.out.print("Enter 10 numbers:");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=input.nextInt();
		}
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=0;j<numbers.length-1-i;j++)
            {
                if(numbers[j]>numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.print("��С���������Ľ����:");
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}