import java.util.Scanner;

public class XITI_12_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zsw=new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			String binaryString=zsw.next();
			int ld=bin2Dec(binaryString);
			System.out.println(binaryString+" 的十进制数是: "+ld);
			
			
		}
		catch(BianryFormatException ex) {
			System.out.println(ex.toString());
		}
	}
	public static int bin2Dec(String binaryString) throws BianryFormatException{
		int result=0;
		for(int i=binaryString.length()-1;i>=0;i--) {
			int judge=judge(binaryString.charAt(i)); //一个一个取出来判断
			if(judge==1)  //判断是否为二进制数
				result +=judge*Math.pow(2, (binaryString.length()-i-1));//是则计算十进制
		}
		return result;
	}
	public static int judge(char ch)throws BianryFormatException { //转换为字符串一个一个取出来判断是否为数字
		if(ch=='0'||ch=='1') {
			return 1;
		}
		else
			throw new BianryFormatException(ch);
	}

}
	//这里定义一个异常类
	class BianryFormatException extends Exception{
		private char ch;
		BianryFormatException(char ch){
			super(" 您输入的不是二进制的数 ");
			this.ch=ch;
		}
		public char getCh() {
			return ch;
		}
	}

