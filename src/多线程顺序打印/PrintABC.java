package 多线程顺序打印;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/3/31 14:01
 */
public class PrintABC extends Thread{
    private int count;
    private String name;
    private Object lock;
    private int flag;
    private static int modecount = 0;
    public PrintABC(int flag,int count,String name,Object object){
        this.count = count;
        this.name = name;
        this.lock = object;
        this.flag = flag;
    }
    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (lock){
                while (modecount%3 != flag){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name);
                modecount++;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        Object o = new Object();
        PrintABC printABC = new PrintABC(0,10,"A",o);
        PrintABC printABC1 = new PrintABC(1,10,"B",o);
        PrintABC printABC2 = new PrintABC(2,10,"C",o);
        printABC.start();
        printABC1.start();
        printABC2.start();
    }
}
