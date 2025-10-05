package assesment;

    import java.util.concurrent.*;
    class Producer implements Runnable {
        private BlockingQueue<Integer> queue;
        private int capacity;

        public Producer(BlockingQueue<Integer> queue, int capacity) {
            this.queue = queue;
            this.capacity = capacity;
        }

        @Override
        public void run() {
            for (int i = 1; i <= capacity; i++) {
                try {
                    System.out.println("Producer produced: " + i);
                    queue.put(i);  // waits if queue is full
                    Thread.sleep(500); // simulate time delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    class Consumer implements Runnable {
        private BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Integer item = queue.take(); // waits if queue is empty
                    System.out.println("Consumer consumed: " + item);
                    Thread.sleep(1000); // simulate time delay
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public class ProducerConsumerDemo {
        public static void main(String[] args) {
            BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5); // capacity 5

            Producer producer = new Producer(buffer, 10); // produce 10 items
            Consumer consumer = new Consumer(buffer);

            Thread producerThread = new Thread(producer);
            Thread consumerThread = new Thread(consumer);

            producerThread.start();
            consumerThread.start();
        }
    }

