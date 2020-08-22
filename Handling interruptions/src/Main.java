class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;

        while (!isInterrupted()) {
            try {
                counter++;
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("It was interrupted");
                break;
            }
        }
    }
}

