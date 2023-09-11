public class Reduce {
    public static void main(String[] args) {
        int n = 100, stepCount = 0;

        while (n > 0) {
            n = (n % 2 == 0) ? n / 2 : n - 1;
            stepCount++;
        }

        System.out.println("Number of steps taken to reduce 100 to 0: " + stepCount);
    }
}
