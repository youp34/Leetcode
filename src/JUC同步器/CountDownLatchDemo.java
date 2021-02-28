package JUC同步器;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/25 13:54
 *
 * 设置初始计数器大小
 * 每次调用countDown计数器依此减一 进入堵塞状态
 * 直到计数器减到0 调用 await方法时 唤醒所有线程
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        for (int i = 0; i < 2; i++) {
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
                System.out.println(Thread.currentThread().getName() + "结束");
            });
        }

        /*System.out.println(countDownLatch.getCount());*/
        System.out.println("开始等待");
        countDownLatch.await();
        Thread.sleep(1000);
        System.out.println("结束");
        executorService.shutdown();
    }
}
