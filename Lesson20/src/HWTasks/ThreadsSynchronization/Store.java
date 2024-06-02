package HWTasks.ThreadsSynchronization;

class Store {
    private final int capacity;
    private int productCount = 0;

    public Store(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce() throws InterruptedException {
        while (productCount == capacity) {
            wait();
        }
        productCount++;
        System.out.println("Producer produced 1 product. Total products in the store: " + productCount);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (productCount == 0) {
            wait();
        }
        productCount--;
        System.out.println("Buyer bought 1 product. Products left in the store: " + productCount);
        notifyAll();
    }
}