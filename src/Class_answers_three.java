import java.util.Scanner;

/**
 * Created by USER on 17.10.2016.
 */


//6.2
public class Class_answers_three {
    public static void main(String[] args) {
        int max=-1;
        int min=100;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целые числа: ");
        String s;
        s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {

            Integer current = Integer.parseInt(s.substring(i, i+1));//преобразование - явное приведение типов

            if (current>max){
                max=current;
            }
            if (current<min){
                min=current;
            }

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
