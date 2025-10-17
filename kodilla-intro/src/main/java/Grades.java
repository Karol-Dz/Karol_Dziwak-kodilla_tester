public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        grades = new int[10];
        size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        grades[this.size] = value;
        size++;
    }
    public int getLastGrade() {
        return grades[size - 1];
    }
    public double getAverage() {
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / size;
    }
}
class App {
    public static void main(String[] args) {
        Grades grades = new Grades ();
        grades.add(4);
        grades.add(3);
        grades.add(5);
        System.out.println(grades.getLastGrade());
        System.out.println(grades.getAverage());
    }
}
