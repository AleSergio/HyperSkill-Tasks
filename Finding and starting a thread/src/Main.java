class ThreadProcessor {
    public static void findAndStartThread(Thread... threads) throws InterruptedException {
        for(Thread a: threads){
            if(a.getState() == Thread.State.NEW){
                a.start();
                a.join();
            }
        }
    }
}