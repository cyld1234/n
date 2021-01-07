import java.util.Scanner;

public class XITI_12_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zsw=new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			String binaryString=zsw.next();
			int ld=bin2Dec(binaryString);
			System.out.println(binaryString+" 的十进制数是: "+ld);
			
			
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.toString()+"不是二进制数 ");
		}
	}
	public static int bin2Dec(String binaryString) throws NumberFormatException{
		int result=0;
		for(int i=binaryString.length()-1;i>=0;i--) {
			int judge=judge(binaryString.charAt(i)); //一个一个取出来判断
			if(judge==-1) {  //判断是否为二进制数
				throw new NumberFormatException(binaryString); //不是抛出异常
			}
			else 
				result +=judge*Math.pow(2, (binaryString.length()-i-1));//是则计算十进制
		}
		return result;
	}
	public static int judge(char ch) { //转换为字符串一个一个取出来判断是否为数字
		if(ch=='0'||ch=='1') {
			return 1;
		}
		else
			return -1;
	}

}

