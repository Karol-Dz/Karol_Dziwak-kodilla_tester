public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public Integer getLastGradess() {
        if (this.size == 0) {
            return null;
        }
        return this.grades[this.size - 1];
    }
    public double averageRating() {
        if (this.size == 0) {
            return 0.0;
        }
        int suma = 0;
        for (int i = 0; i < this.size; i++) {
            suma += this.grades[i];
        }
        return (double) suma / this.size;
}
