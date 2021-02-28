package JUC同步器;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/25 14:11
 *
 *  （回环屏障）
 * cyclicBarrier初始化计数器大小
 * 线程 当调用await的时候 计数器+1 堵塞线程
 * 当计数器的大小和初始的计数器数值一样的时候 冲破屏障 解除堵塞状态
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        for (int i = 0; i < 3; i++) {
            executorService.execute(()->{
                try {
                    System.out.println(Thread.currentThread().getName()+"===1");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+"===2");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+"===3");
                    cyclicBarrier.await();
                    System.out.println(Thread.currentThread().getName()+"===4");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("开始");
        executorService.shutdown();
        System.out.println("结束");
    }
}
