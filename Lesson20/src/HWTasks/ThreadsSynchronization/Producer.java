package HWTasks.ThreadsSynchronization;

class Producer implements Runnable {
    private final Store store;
    private static final int PRODUCE_COUNT = 5;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < PRODUCE_COUNT; i++) {
                store.produce();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}