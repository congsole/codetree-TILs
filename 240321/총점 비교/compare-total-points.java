import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int a, b, c;

    public Student(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public int compareTo(Student student) {
        return (this.a + this.b + this.c) - (student.a + student.b + student.c);
    }
    @Override
    public String toString() {
        return this.name + " " + this.a + " " + this.b + " " + this.c;
    }

}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] list = new Student[n];
        for(int i = 0; i < n; i++) {
            list[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(list);

        for(int i = 0; i < n; i++) {
            System.out.println(list[i].toString());
        }
    }
}