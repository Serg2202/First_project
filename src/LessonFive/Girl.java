package LessonFive;

/**
 * Created by USER on 26.10.2016.
 */
public class Girl {
    String name;
    int age;

    public Girl() {//конструктор без параметров

    }

    public Girl(String name, int age) {//конструктор который принимает 2 параметра
        this.name = name;
        this.age = age;
    }

    void goToCinema() {
        System.out.println();
    }

    public boolean equals(Girl o) {
        if (o.name == name && o.age == age) {
            System.out.println(o);
        }
        return true;
    }
}
