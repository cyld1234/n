import java.util.Scanner;
public class XITI_12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zsw=new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			String hexString=zsw.next();
			int ld=hexToDec(hexString);
			System.out.println(hexString+" ��ʮ��������: "+ld);
			
			
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.toString()+"����ʮ�������� ");
		}
	}
	public static int hexToDec(String hexString) throws NumberFormatException{
		int result=0;
		for(int i=hexString.length()-1;i>=0;i--) {
			int judge=judge(hexString.charAt(i)); //һ��һ��ȡ�����ж�
			if(judge==-1) {  //�ж��Ƿ�Ϊʮ��������
				throw new NumberFormatException(hexString); //�����׳��쳣
			}
			else 
				result +=judge*Math.pow(16, (hexString.length()-i-1));//�������ʮ����
		}
		return result;
	}
	public static int judge(char ch) { //ת��Ϊ�ַ���һ��һ��ȡ�����ж��Ƿ�Ϊ����
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
