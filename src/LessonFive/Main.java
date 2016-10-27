package LessonFive;

/**
 * Created by USER on 26.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        /*
        Sortis.m();//вызвали метод m
        Sortis.m(1.0);
        Sortis.m(2);
        Sortis.m(1,2);
        Sortis.m(1,2,3,4,5,6,7,8);
        Sortis.m(1,2.0);
*/
        Girl ira = new Girl("Ira", 20);
        Girl ira2 = new Girl("ira", 20);
        Girl ira1 = new Girl("iren",21);
        System.out.println(ira.equals(ira1));
        System.out.println(ira.equals(ira2));

    }
}
