import java.util.*;

class Student implements Comparable<Student> {
    int num;
    int height;
    int weight;

    public Student(int num, int height, int weight) {
        this.num = num;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Student s) {
        if(s.height == this.height) {
            if(s.weight == this.weight) {
                return this.num - s.num;
            }
            return s.weight - this.weight;
        }
        return s.height - this.height;
    }
    @Override
    public String toString() {
        return this.height + " " + this.weight + " " + this.num ;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] list = new Student[n];

        for(int i = 0; i < n; i++) {
            list[i] = new Student(i+1, sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(list);

        for(int i = 0; i < n; i++) {
            System.out.println(list[i].toString());
        }
    }
}