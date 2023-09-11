public class Multiples {
    public static void main(String[] args) {
        int i = 0, threeMultiplesCount = 0, fiveMultiplesCount = 0;

        while (i < 1000) {
            threeMultiplesCount += (i % 3 == 0) ? 1 : 0;
            fiveMultiplesCount += (i % 5 == 0) ? 1 : 0;
            i++;
        }

        System.out.println("# of non-negative multiples of 3 below 1000: " + threeMultiplesCount);
        System.out.println("# of non-negative multiples of 5 below 1000: " + fiveMultiplesCount);
    }
}
