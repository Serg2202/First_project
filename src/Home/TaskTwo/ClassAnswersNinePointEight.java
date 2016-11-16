package Home.TaskTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.
public class ClassAnswersNinePointEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер стороны матрицы в виде целого числа n: ");
        int n = in.nextInt();
        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt((n * 2) - n);
            }
        }
        System.out.println("Original random matrix: ");
        for (int[] current : matrix) {
            for (int i : current) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
elementsEqualToZero(matrix);
        System.out.println("elementsEqualToZero: ");
        for (int[] current : matrix) {
            for (int i : current) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void elementsEqualToZero(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            int n=0;
            int[]c=new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j]!=0){
                    c[n++]=matrix[i][j];//создает новый массив и присваиваем значение ненулевое
                }
            }
            matrix[i]= Arrays.copyOf(c, c.length);//метод который
        }
    }

}
