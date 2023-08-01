public class SequentialArrayElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        Object lock = new Object();

        Thread thread1 = new Thread(() -> printArrayElements(arr1, lock));
        Thread thread2 = new Thread(() -> printArrayElements(arr2, lock));

        thread1.start();
        thread2.start();
    }

    public static void printArrayElements(int[] arr, Object lock) {
        synchronized (lock) {
            for (int element : arr) {
                System.out.print(element + " ");
                try {
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notify();
        }
    }
}
