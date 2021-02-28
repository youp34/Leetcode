package JUC同步器;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/25 14:27
 */
public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 3; i++) {
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName());
                semaphore.release();
                System.out.println(Thread.currentThread().getName()+"======down");
            });
        }
        semaphore.acquire();
        System.out.println("============");
        executorService.shutdown();
    }
}
