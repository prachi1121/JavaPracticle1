public class SumCalculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        SumCalculator calc = new SumCalculator();

        int intSum = calc.sum(10, 20);
        double doubleSum = calc.sum(15.5, 4.5);

        System.out.println("Sum of two integers: " + intSum);
        System.out.println("Sum of two doubles: " + doubleSum);
    }
}

