/**
 * Created by USER on 17.10.2016.
 */
public class Lesson_three {
    public static void main(String[] args) {
        // int i=12;
       /* switch (i){
           case 11:
               System.out.println("11");
               break;
            case 12:
                default:
                    System.out.println("nothing");
       }
       */
       /*
       while (i>0) {
           System.out.println("loop");
       i--;
       }
       */
       /*
       for (int i=0; i<10;i++){
           System.out.println(i);
       }
       */

        int[] a= {1, 2, 3, 4, 5, 6, 7, 8,9, 10};// массив (есть множество интов и есть переменная котрая на них указывает), массив это ссылочный тип - хранится в хипе. т.е набор определеннных значенипй. можем применить свойство lenght
        /*
        for (int i=0; i<a.length; i++){

            System.out.println(a[i]);//пишем к камоку элементу буудем обращаться. массив всегда удобно представить в виде поезда
            //существует цикл foreach - но у него такое отличие (я перебираю какое-то из множеств)
         */
       for (int x:a){//объявляем переменную х
           System.out.println(x);
       }

    }
}
