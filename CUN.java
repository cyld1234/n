import java.util.*;
public class CUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// books对象
		books books1=new books(1,"java",7.0,"小刘出版社");
		books books2=new books(2,"math",1.0,"小赵出版社");
		books books3=new books(3,"chinese",9.0,"小钟出版社我");
		
		// 放进HashMap中，key是图书编号， value是图书对象
		HashMap<Integer,books> booksHashMap=new HashMap<>();
		booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);
        
        // 或者不用创建books类， 用HashMap集合存储图书的属性， 然后放进list集合中，
        // 为了让图书编号作为key
        List<HashMap<Integer,books>> booksList=new ArrayList<>();
        booksList.add(booksHashMap);
        
        
        // 输出
        System.out.println("编号\t名称\t单价\t出版 ");
        for(HashMap<Integer,books> h:booksList) {
        	// 获取key
        	Set<Integer> key=h.keySet();
        	for(Integer i:key) {
        		// 通过key找value
        		System.out.println(i + "\t" + h.get(i).getName() + "\t" + h.get(i).getPrice() + "\t"+h.get(i).getPress());
        	}
        }
	}

}

// 创建books类，存放图书的属性
class books{
	
	private int num;//编号
	private String name;//名称
	private double price;//价格
	private String press;//出版社
	
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


















