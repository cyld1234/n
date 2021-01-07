import java.util.Scanner;
public class XITI_12_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zsw=new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			String hexString=zsw.next();
			int ld=hex2Dec(hexString);
			System.out.println(hexString+" ��ʮ��������: "+ld);
			
			
		}
		catch(HexFormationException ex) {
			System.out.println(ex.toString());
		}
	}
	public static int hex2Dec(String hexString) throws HexFormationException{
		int result=0;
		for(int i=hexString.length()-1;i>=0;i--) {
			int judge=judge(hexString.charAt(i)); //һ��һ��ȡ�����ж�
				result +=judge*Math.pow(16, (hexString.length()-i-1));// ��,�����ʮ����
		}
		return result;
	}
	public static int judge(char ch)throws HexFormationException{ //ת��Ϊ�ַ���һ��һ��ȡ�����ж��Ƿ�Ϊ����
		if(ch>='0'&&ch<='9') {
			return (ch-'0');
		}
		else if(ch>='A'&&ch<='F') {
			return (ch-'A'+10);
			
		}
		else
			throw new HexFormationException(ch);
	}

}
//���ﶨ��һ���쳣��
class HexFormationException extends Exception{
	private char ch;
	HexFormationException(char ch){
		super(" ������Ĳ���ʮ�����Ƶ��� "+ch);
		this.ch=ch;
	}
	public char getCh() {
		return ch;
	}
}