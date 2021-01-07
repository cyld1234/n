import java.util.Scanner;
public class 冒泡排序 {
    public static void main(String[] args) {
        //冒泡排序算法
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
        System.out.print("从小到大排序后的结果是:");
        for(int i=0;i<numbers.length;i++)
            System.out.print(numbers[i]+" ");
    }
}