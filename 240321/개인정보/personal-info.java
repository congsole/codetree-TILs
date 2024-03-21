import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(String n, int h, double w) {
        this.name = n;
        this.height = h;
        this.weight = w;
    }
    @Override
    public String toString() {
        return this.name + " " + this.height + " " + this.weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] list = new Person[5];
        for(int i = 0; i < 5; i++) {
            list[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(list, (a,b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(int i = 0; i < 5; i++) {
            System.out.println(list[i].toString());
        }
        System.out.println();

        Arrays.sort(list, (a,b) -> b.height - a.height);
        System.out.println("height");
        for(int i = 0; i < 5; i++) {
            System.out.println(list[i].toString());
        }
    }
}