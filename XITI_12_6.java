import java.util.Scanner;
public class XITI_12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zsw=new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			String hexString=zsw.next();
			int ld=hexToDec(hexString);
			System.out.println(hexString+" 的十进制数是: "+ld);
			
			
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.toString()+"不是十六进制数 ");
		}
	}
	public static int hexToDec(String hexString) throws NumberFormatException{
		int result=0;
		for(int i=hexString.length()-1;i>=0;i--) {
			int judge=judge(hexString.charAt(i)); //一个一个取出来判断
			if(judge==-1) {  //判断是否为十六进制数
				throw new NumberFormatException(hexString); //不是抛出异常
			}
			else 
				result +=judge*Math.pow(16, (hexString.length()-i-1));//是则计算十进制
		}
		return result;
	}
	public static int judge(char ch) { //转换为字符串一个一个取出来判断是否为数字
		if(ch>='0'&&ch<='9') {
			return (ch-'0');
		}
		else if(ch>='A'&&ch<='F') {
			return (ch-'A'+10);
			
		}
		else
			return-1;
	}

}
