import java.util.*;
public class CUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// books����
		books books1=new books(1,"java",7.0,"С��������");
		books books2=new books(2,"math",1.0,"С�Գ�����");
		books books3=new books(3,"chinese",9.0,"С�ӳ�������");
		
		// �Ž�HashMap�У�key��ͼ���ţ� value��ͼ�����
		HashMap<Integer,books> booksHashMap=new HashMap<>();
		booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);
        
        // ���߲��ô���books�࣬ ��HashMap���ϴ洢ͼ������ԣ� Ȼ��Ž�list�����У�
        // Ϊ����ͼ������Ϊkey
        List<HashMap<Integer,books>> booksList=new ArrayList<>();
        booksList.add(booksHashMap);
        
        
        // ���
        System.out.println("���\t����\t����\t���� ");
        for(HashMap<Integer,books> h:booksList) {
        	// ��ȡkey
        	Set<Integer> key=h.keySet();
        	for(Integer i:key) {
        		// ͨ��key��value
        		System.out.println(i + "\t" + h.get(i).getName() + "\t" + h.get(i).getPrice() + "\t"+h.get(i).getPress());
        	}
        }
	}

}

// ����books�࣬���ͼ�������
class books{
	
	private int num;//���
	private String name;//����
	private double price;//�۸�
	private String press;//������
	
	public books() {
		
	}
	books(int num,String name,double price,String press){
		super();
		this.num=num;
		this.name=name;
		this.price=price;
		this.press=press;
	
	}
	int getNum() {
		return num;
	}
	String getName() {
		return name;
	}
	double getPrice() {
		return price;
	}
	String getPress() {
		return press;
	}
}


















