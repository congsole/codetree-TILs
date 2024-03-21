import java.util.*;

class Student implements Comparable<Student> {
    
    int height;
    int weight;
    int num;

    public Student(int h, int w, int n) {
        this.height = h;
        this.weight = w;
        this.num = n;
    }

    @Override
    public int compareTo(Student s) {
        if(this.height == s.height) {
            return s.weight - this.weight;
        }
        return this.height - s.height;
    }
    @Override
    public String toString() {
        return this.height + " " + this.weight + " " + this.num;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] list = new Student[n];
        for(int i=0; i<n; i++) {
            list[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(list);
        
        for(int i=0; i<n; i++) {
            System.out.println(list[i].toString());
        }
    }
}