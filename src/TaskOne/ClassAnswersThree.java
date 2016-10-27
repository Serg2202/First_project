package TaskOne;

import java.util.Scanner;

//ответ по заданию №3 - Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
public class ClassAnswersThree {
    public static void main(String[] args) {
        //region Read value-  здесь у нас блок "Получение исходных данных". На выходе блока будет строка.
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите набор случайных чисел через пробел: ");
        s = in.nextLine();
        //endregion

        String[] arrayString = s.split(" ");

        //region - вывести введенные числа в столбик (каждое новое значение с ново йтсроки идет).
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
        //вывести введенные числа в строку (каждое новое значение записывается в строку рядом с последним).
        for (int n = 0; n < arrayString.length; n++) {
            System.out.print(arrayString[n]);
        }
        //endregion

    }
}
