import java.util.Scanner;
import java.util.ArrayList;

public class XiTi_11_13 { 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        Scanner in =new Scanner(System.in);
        System.out.print("Enter 10 integers: "); 
        int value;
        //����10��ֵ
        for(int i=0;i<10;i++){
            value =in.nextInt();
            list.add(value);
        }
        //���
        System.out.print("The distinct integrs are: "); 
        quchong(list); 
        list.forEach((as) -> {   
            System.out.print(as+" ");
        });
        System.out.println(); 
    } 
    //ɾ���ظ�Ԫ��
    public static void quchong(ArrayList<Integer> list) {    
        int size = list.size();    
        int temp = 0;    
        for(int i = 0; i < size -temp;i++) {     
            for(int j = 1+i; j < size - temp;j++) {          
                if(list.get(i) == list.get(j)) {             
                    list.remove(j);                  
                    temp++;                       
                    j=j-1;               
                }    
            } 
        }
    }
}
