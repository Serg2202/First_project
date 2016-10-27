package Package_one;

// класс может содержать статтические блоки кода ,к кот мы обращаемся
public class Girl {

    String name;
    int age;

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void goToCinema(){
        System.out.println("Go!");

    }
}
