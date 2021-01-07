import java.util.Scanner;

public class XITI_12_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner zsw=new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			String binaryString=zsw.next();
			int ld=bin2Dec(binaryString);
			System.out.println(binaryString+" ��ʮ��������: "+ld);
			
			
		}
		catch(BianryFormatException ex) {
			System.out.println(ex.toString());
		}
	}
	public static int bin2Dec(String binaryString) throws BianryFormatException{
		int result=0;
		for(int i=binaryString.length()-1;i>=0;i--) {
			int judge=judge(binaryString.charAt(i)); //һ��һ��ȡ�����ж�
			if(judge==1)  //�ж��Ƿ�Ϊ��������
				result +=judge*Math.pow(2, (binaryString.length()-i-1));//�������ʮ����
		}
		return result;
	}
	public static int judge(char ch)throws BianryFormatException { //ת��Ϊ�ַ���һ��һ��ȡ�����ж��Ƿ�Ϊ����
		if(ch=='0'||ch=='1') {
			return 1;
		}
		else
			throw new BianryFormatException(ch);
	}

}
	//���ﶨ��һ���쳣��
	class BianryFormatException extends Exception{
		private char ch;
		BianryFormatException(char ch){
			super(" ������Ĳ��Ƕ����Ƶ��� ");
			this.ch=ch;
		}
		public char getCh() {
			return ch;
		}
	}

