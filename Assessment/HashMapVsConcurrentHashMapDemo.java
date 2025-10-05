package assesment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

    public class HashMapVsConcurrentHashMapDemo {

        public static void main(String[] args) throws InterruptedException {
            System.out.println("=== HashMap Demo ===");
            runHashMapDemo();

            System.out.println("\n=== ConcurrentHashMap Demo ===");
            runConcurrentHashMapDemo();
        }
        private static void runHashMapDemo() throws InterruptedException {
            Map<Integer, String> map = new HashMap<>();

            Runnable writerTask = () -> {
                for (int i = 0; i < 1000; i++) {
                    map.put(i, Thread.currentThread().getName());
                }
            };

            Thread t1 = new Thread(writerTask, "Writer-1");
            Thread t2 = new Thread(writerTask, "Writer-2");

            t1.start();
            t2.start();

            t1.join();
            t2.join();
            System.out.println("Final HashMap size: " + map.size());
            System.out.println("Some entries: " + map.entrySet().stream().limit(10).toList());
        }
        private static void runConcurrentHashMapDemo() throws InterruptedException {
            Map<Integer, String> cmap = new ConcurrentHashMap<>();

            Runnable writerTask = () -> {
                for (int i = 0; i < 1000; i++) {
                    cmap.put(i, Thread.currentThread().getName());
                }
            };

            Thread t1 = new Thread(writerTask, "Writer-1");
            Thread t2 = new Thread(writerTask, "Writer-2");

            t1.start();
            t2.start();

            t1.join();
            t2.join();
            System.out.println("Final ConcurrentHashMap size: " + cmap.size());

        }
}