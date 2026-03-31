package win.babrakov.threadtermination;

import java.math.BigInteger;

public class LongComputation {

    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationThread(new BigInteger("20000"), new BigInteger("100000000000")));

        thread.setDaemon(true);
        thread.start();
        thread.interrupt();
    }

    private static class LongComputationThread extends Thread {

        private BigInteger base;
        private BigInteger power;

        public LongComputationThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + power + " = " + pow(base, power));
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
//                if (Thread.currentThread().isInterrupted()) {
//                    System.out.println("Thread was interrupted");
//                    return BigInteger.ZERO;
//                }
                result = result.multiply(base);
            }
            return result;
        }
    }

}
