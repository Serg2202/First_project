package Home.TaskTwo;

import java.util.Scanner;

// задание 1. Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class ClassAnswersOne {
    public static void main(String[] args) {
        String s;
        int lenghtMin;
        int lenghtMax;

        String min;
        String max;


        //region Read value - здесь у нас блок "Получение исходных данных". На выходе блока будет строка.
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести n целых чисел с консоли: ");
        s = in.nextLine();
        //endregion

        //region - Здесь у нас "технический блок" - преобразуем/парсим введенные строки к масиссиву целых чисел.
        String[] arrayString = s.split(" ");

        //endregion

        lenghtMin = arrayString[1].length();// отталкиваемся от реального значения, от первого элемента
        lenghtMax = arrayString[1].length();// отталкиваемся от реального значения, от первого элемента

        min = arrayString[1];
        max = arrayString[1];// инициализируем переменные, в которые запишем макс/мин число

        for (int i = 1; i < arrayString.length; i++) {
            if (arrayString[i].length() < lenghtMin) {
                lenghtMin = arrayString[i].length();
                min = arrayString[i];
            }
            if (arrayString[i].length() > lenghtMax) {
                lenghtMax = arrayString[i].length();
                max = arrayString[i];
            }

        }
        System.out.println("Минимальное число = " + min + ", минимальная длина = " + lenghtMin);
        System.out.println("Максимальное число = " + max + ", максимальная длина = " + lenghtMax);
    }

}
