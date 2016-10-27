package LessonFive;

/**
 * Created by USER on 26.10.2016.
 */
public class Sortis {
  static void m() {
      System.out.println("m()");
  }
    static void m(int a) {
        System.out.println("m(int a)");
    }
    static void m(int a, int b) {
        System.out.println("mint a, int b)");
    }
    static void m(double d) {
        System.out.println("m(double d)");
    }
    static void m(int...g) {// много интов
        System.out.println("m(int...g)");
    }
    static double m(int a, double b) {
        System.out.println("(double m(int a, double b))");
        return 12.6;
    }
}
