package demo;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/26 18:42
 */
public class Test {
        public static void xiaoFei(Thread thread){
            ExecutorService executorService = Executors.newFixedThreadPool(10);
            executorService.submit(thread);
        }

        public static void main(String[] args) throws InterruptedException {
            int i =100;
            Object obj = new Object();
            for (int j = 0; j < i; j++) {
                Thread thread = new Thread(){
                    @Override
                    public void run() {
                        Random random = new Random();
                        System.out.println(random);
                        obj.notify();
                    }
                };
                xiaoFei(thread);
                obj.wait();
            }
        }
}
