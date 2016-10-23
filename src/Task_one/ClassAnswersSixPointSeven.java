package Task_one;

import java.util.Scanner;

/**
 * Created by USER on 21.10.2016.
 */
public class ClassAnswersSixPointSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы, которые равны полусумме соседних элементов: ");
        String s;
        s = in.nextLine();
        /*сюда нужно добавить еще один цикл, который будет преобразовывать введенные числа и передевать их в массив.
        Т.е. у нас по сути будет 2 массива.*/
for (int i=0; i<s.length();i++){

}



        int[] numbers =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i=1; i<numbers.length-1; i++){
            if (numbers[i]==(numbers[i-1]+numbers[i+1])/2){
                System.out.println(numbers[i]);
            };
        }
    }
}
