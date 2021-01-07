import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class XiTi_11_9 { 
public static void main(String[] args) {

    ArrayList<Integer> list1 = new ArrayList<>(); //存行
    ArrayList<Integer> list2 = new ArrayList<>();  //存列
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the array size n:");
    int n = input.nextInt();
    Integer row = 0;   
    Integer column = 0;
    Integer row_Max = 0;  //行里面最多有几个1
    Integer column_Max = 0; //列里面最多有几个1
    int[][] array = new int[n][n];
    Random rand = new Random();
 
    //完成初始化并且用Max 记录行、列里面各自最多有几个1
    System.out.println("The random array is");
    for(int i = 0;i < array.length;i++) {
        for(int j = 0;j < array[0].length;j++) {
            int randInt = rand.nextInt(2); //0-1之间的随机数
            array[i][j] = randInt;
            System.out.print(array[i][j] + " ");
            if(randInt == 1) row++; //‘1’ 的行累加
        }
        if(row > row_Max) row_Max = row;  //存储行里面最多有几个1
        //归零
        row = 0;
        System.out.println();
    }
 
    for(int i = 0;i < array.length;i++) {
        for(int j = 0;j < array[0].length;j++) {
            if(array[j][i] == 1) column++;   //‘1’的 列 累加
        }
        if(column > column_Max) column_Max = column;  //存储列里面最多有几个1
        column = 0;
    }
 
    //遍历数组将最多1的行、列下标存到list1、list2里面
    for(int i = 0;i < array.length;i++) {
        for(int j = 0;j < array[0].length;j++) {
            if(array[i][j] == 1) row++;
            if(array[j][i] == 1) column++;
        }
        if(row == row_Max) list1.add(i);
        if(column == column_Max) list2.add(i);
        row = 0;
        column = 0;
    }
 
    //输出list1，list2的结果
    System.out.print("The largest row index: ");
    for(Integer a:list1)
        System.out.print(a + " ");
    System.out.println('\n'+"The largest column index: ");
    for(Integer b:list2)
        System.out.print(b);
 }
}