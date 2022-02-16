package xishushuzu;

import java.io.*;

/**
 * @description: 稀疏数组
 * @author: ljt
 * @time: 2022/2/16 0016 11:06
 */
public class SparseArray {

    public static void main(String[] args) {
        //创建一个原始的二维数组 11-11  0表示没有棋子 1 黑子 2 蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //输出原始的二维数组
        System.out.println("输出原始的二维数组");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //将二维数组 转稀疏数组的思想 1 先遍历二维数组 得到非0的数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
        //创建对应的稀疏数组
        int sparseArray[][] = new int[sum + 1][3];
        //给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        //下一步 遍历二位数组 将非0的值存放到 数组中
        int count = 0;  // count 用于记录是第几个非0的数据
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {   //1-2
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr1[i][j];
                }
            }
        }

        System.out.println("输出稀疏数组");
        for (int[] row : sparseArray) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }


        //将稀疏数组返回成原始数组
        //先读取 稀疏数组的第一行
        int chessArray2[][] = new int[sparseArray[0][0]][sparseArray[0][1]];

        //给原始数组进行赋值
        for (int i = 1; i < sparseArray.length; i++) {
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        System.out.println("输出赋值之后的原始数组");


        for (int[] row : chessArray2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }





    }
}
