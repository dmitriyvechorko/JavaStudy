package HWTasks.ThreadsSynchronization;

class Consumer implements Runnable {
    private final Store store;
    private static final int CONSUME_COUNT = 5;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < CONSUME_COUNT; i++) {
                store.consume();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
