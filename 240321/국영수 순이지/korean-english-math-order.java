import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int k, e, m;

    public Student(String name, int k, int e, int m) {
        this.name = name;
        this.k = k;
        this.e = e;
        this.m = m;
    }
    @Override
    public int compareTo(Student student) {
        if(student.k == this.k) {
            if(student.e == this.e) {
                return student.m - this.m;
            }
            return student.e - this.e;
        }
        return student.k - this.k;
    }
    @Override
    public String toString() {
        return this.name + " " + this.k + " " + this.e + " " + this.m;
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