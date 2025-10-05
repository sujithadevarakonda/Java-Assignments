package assesment;

public class oddandeven {
        public static class PrintNumbers {
            static volatile boolean oddTurn = true;

            static class Odd implements Runnable {
                @Override
                public void run() {
                    for (int i = 1; i <= 20; i += 2) {
                        synchronized (PrintNumbers.class) {
                            while (!oddTurn) {
                                try {
                                    PrintNumbers.class.wait();
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                            System.out.println("Odd: " + i);
                            oddTurn = false;
                            PrintNumbers.class.notify();
                        }
                    }
                }
            }

            static class Even implements Runnable {
                @Override
                public void run() {
                    for (int i = 2; i <= 20; i += 2) {
                        synchronized (PrintNumbers.class) {
                            while (oddTurn) {
                                try {
                                    PrintNumbers.class.wait();
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                            System.out.println("Even: " + i);
                            oddTurn = true;
                            PrintNumbers.class.notify();
                        }
                    }
                }
            }

            public static void main(String[] args) {
                Thread oddThread = new Thread(new Odd());
                Thread evenThread = new Thread(new Even());

                oddThread.start();
                evenThread.start();
            }
        }
    }

