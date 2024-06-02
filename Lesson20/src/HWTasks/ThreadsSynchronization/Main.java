package HWTasks.ThreadsSynchronization;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(3);

        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Production and purchasing are completed.");
    }
}





