package Home.TaskOne;

import java.util.Scanner;

public class ClassAsnwersSixPointOne {
    public static void main(String[] args) {

//задание №6.1 - Ввести с консоли n целых чисел. На консоль вывести: 6.1. Четные и нечетные числа.


        Scanner in = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        String s;
        s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            Integer current = new Integer(s.charAt(i));


            if (current % 2 == 0) {
                System.out.println("Четное число: " + s.charAt(i));
            } else {
                System.out.println("Нечетное число: " + s.charAt(i));
            }


        }


    }


}


