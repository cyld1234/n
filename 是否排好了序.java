  import java.util.Scanner;
  import java.util.Arrays;

 public class �Ƿ��ź�����{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the list�� ");
        int sizeOfList=input.nextInt();  //���������С
        int[] list=new int[sizeOfList];
        int[] list1=new int[list.length];
        System.out.println("Enter the contents of the list�� ");
        for(int i=0;i<list.length;i++){             
        	list[i]=input.nextInt();      //��������
        }
        System.out.print("The list has "+sizeOfList+" integers ");
       for(int a:list){
             System.out.print(a+" ");  //�������
         }
         for(int i=0;i<list.length;i++){
             list1[i]=list[i];         //���������໥��ֵ
         }
         if(isSorted(list1,list)){      //�ж��Ƿ��ź���
             System.out.println("\nThe list is already sorted");
         }         else System.out.println("\nThe list is not sorted");     }     
    

     public static boolean isSorted(int[] list1,int[] list){
         if(Arrays.equals(list1,bubble(list))){
             return true;
         }
        return false;
    }
     
    
     

     public static int[] bubble(int[] list) {        //ð������
         for(int i=0;i<list.length;i++){
             for(int j=0;j<list.length-1-i;j++){                
            	 if(list[j]>list[j+1]){
                     int temp=list[j];
                     list[j]=list[j+1];
                     list[j+1]=temp;
                 }
             }        }
         return list;
     }
 }