import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private ArrayList<Integer> numbers = new ArrayList<>();
    private Random random = new Random();

    public void generateNumbers() {
        int sum = 0;
        while (sum <= 5000) {
            int number = random.nextInt(31); // losuje od 0 do 30
            numbers.add(number);
            sum += number;
        }
        System.out.println("Drawn " + numbers.size() + " Number. Sum = " + sum);
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.generateNumbers();

        System.out.println("The highest number drawn: " + rn.getMax());
        System.out.println("The smallest number drawn: " + rn.getMin());
    }
}
