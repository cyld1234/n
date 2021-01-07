import java.util.Scanner;
public class 不同的数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.print("Enter 10 numbers:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		int size=arr.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					for(int k=j+1;k<size;k++)
						arr[k-1]=arr[k];
					size--;
				}
			}
		}
		System.out.println("The number of distinct number is "+size);
		System.out.print("The distinct numbers are: ");
	for(int i=0;i<size;i++) {
		System.out.print(arr[i]+" ");
		}
	}
}