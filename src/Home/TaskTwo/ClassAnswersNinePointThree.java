package Home.TaskTwo;

import java.util.Random;
import java.util.Scanner;

//9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

public class ClassAnswersNinePointThree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер стороны матрицы в виде целого числа n: ");
        int n=in.nextInt();
        Random rand=new Random();
        int matrix[][]=new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=rand.nextInt((n*2)-n);

            }
        }
        System.out.println("Original random matrix: ");
        for (int[] current:matrix) {
            for (int i:current) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    public static void inDecrease(int matrix[][]){
        int[] f=new int[matrix.length*matrix.length];
        int c=0;
        int r=0;
        int max=0;
        int h=0;
        int m=0;
        int min=0;
        int h1=0;

    }

    }

