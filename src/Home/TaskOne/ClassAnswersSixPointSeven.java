package Home.TaskOne;

import java.util.Scanner;

// 6.Ввести с консоли n целых чисел. На консоль вывести: 6.7. Элементы, которые равны полусумме соседних элементов.
public class ClassAnswersSixPointSeven {
    public static void main(String[] args) {
        int[] numbers;
        String s;

        //region Read value - здесь у нас блок "Получение исходных данных". На выходе блока будет строка.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел числа от 1 до 9");
        s = in.nextLine(); //2 7 1 5 6 4 2 2
        //endregion


        //region - Здесь у нас "технический блок" - преобразуем/парсим введенные строки к масиссиву целых чисел.
        String[] arrayString = s.split(" ");
        numbers = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            numbers[i] = Integer.parseInt(arrayString[i]);

        }
        //endregion


        //region - Здесь у нас блок бизнес-логики. здесь мы работаем с целыми числами и здесь непосредственно выполняется наше задание.

        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] == (numbers[i - 1] + numbers[i + 1]) / 2) {
                System.out.println(numbers[i]);
            }
            ;
        }
        //endregion
    }
}
