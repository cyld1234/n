import java.util.Scanner;
public class 对学生排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num; //定义数字
		System.out.print("请输入学生个数： "); //输出

		num=input.nextInt();
		String[] name=new String[num];
		double[] result=new double[num];
		for(int i=0;i<num;i++) {
			System.out.print("请输入第"+(i+1)+"学生的姓名；");
			name[i]=input.next();
			System.out.print("请输入第"+(i+1)+"学生的成绩；");
			result[i]=input.nextDouble();
		}
		listSort(result,name,num);
	}
	private static void listSort(double[] result,String[] name,int num) {
		double tmpResult;
		String tmpName;
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++) {
				if(result[i]<result[j]) {
					tmpResult=result[j];
					result[j]=result[i];
					result[i]=tmpResult;
					tmpName=name[j];
					name[j]=name[i];
					name[i]=tmpName;
				}
			}
		}
		System.out.print("姓名： ");
		for(int i=0;i<num;i++) {
			System.out.print(name[i]+" ");
		}
	}
}
