
public class ´¢Îï¹ñÄÑÌâ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] lockers=new boolean[101];
		
		for(int i=1;i<=100;i++) {
			lockers[i]=false;
		}
			for(int i=1;i<=100;i++) {
				for(int j=i;j<=100;j+=i) {
					lockers[j]=!lockers[j];
				}
			}
				System.out.println("Opened lockers: ");
				for(int i=1;i<=100;i++)
					if(lockers[i])
						System.out.print(i+" ");

		}
	}

