package Task_one;

import java.util.Random;

//ответ по заданию №3 - Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
public class ClassAnswersThree {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            int s = rand.nextInt(21) - 5;
            System.lineSeparator();
            System.out.println(s);

        }
        int n=rand.nextInt(100);//задаем промежуток случайных чисел, если убрать значение то число будет генериться максимальной длины
        int[] a =new int[10];//массив из 10 элементов типа int
    }
}
