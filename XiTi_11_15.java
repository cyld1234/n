import java.util.*;
class point{
	public double x;
	public double y;
	point(){
		this.x=0;
		this.y=0;
	}
}
public class XiTi_11_15 {
	    public static float caculate(point vertex[],int pointNum)
	    {
	    	int i=0;
	    	float temp=0;
	    	for(i=0;i<pointNum-1;i++)
	    	{
	    		temp+=(vertex[i].x-vertex[i+1].x)*(vertex[i].y+vertex[i+1].y);
	    	}
	    	temp+=(vertex[i].x-vertex[0].x)*(vertex[i].y+vertex[0].y);
	    	return temp/2;
	    }
        public static void main(String args[]) 
        {
        	point[] vertex=new point[100];
        	int pointNum=0;
        	Scanner in = new Scanner(System.in);
        	for(int i=0;i<100;i++)
        	{
        		vertex[i]= new point();
        	}
        	System.out.println("���������ζ�����,�������ܳ���100��(��ʱ�룩��");
        	pointNum=in.nextInt();
        	for(int i=1;i<=pointNum;i++)
        	{
        		System.out.println("��"+i+"������ĺ�����:");
        		vertex[i].x = in.nextDouble();
        		System.out.println("��"+i+"�������������:");
        		vertex[i].y = in.nextDouble();
        	}
        	System.out.println("���������ǣ�"+caculate(vertex,pointNum));
        }
}
 