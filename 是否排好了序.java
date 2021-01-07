  import java.util.Scanner;
  import java.util.Arrays;

 public class 是否排好了序{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the list： ");
        int sizeOfList=input.nextInt();  //定义数组大小
        int[] list=new int[sizeOfList];
        int[] list1=new int[list.length];
        System.out.println("Enter the contents of the list： ");
        for(int i=0;i<list.length;i++){             
        	list[i]=input.nextInt();      //输入数组
        }
        System.out.print("The list has "+sizeOfList+" integers ");
       for(int a:list){
             System.out.print(a+" ");  //输出数组
         }
         for(int i=0;i<list.length;i++){
             list1[i]=list[i];         //两个数组相互赋值
         }
         if(isSorted(list1,list)){      //判断是否排好序
             System.out.println("\nThe list is already sorted");
         }         else System.out.println("\nThe list is not sorted");     }     
    

     public static boolean isSorted(int[] list1,int[] list){
         if(Arrays.equals(list1,bubble(list))){
             return true;
         }
        return false;
    }
     
    
     

     public static int[] bubble(int[] list) {        //冒泡排序
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