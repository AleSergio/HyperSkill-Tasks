import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newCachedThreadPool(); // assign an object to it

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            BigInteger bigInteger = BigInteger.valueOf(number);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));
            if (probablePrime && number != 1) {
                executor.submit(() -> {
                    System.out.println(number);
                });
            }
        }
        executor.shutdown();

    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number);
    }
}
