package LRU缓存机制146;

import java.util.LinkedHashMap;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/17 18:12
 *
 * 最差  运行超时
 * 最近最少使用
 */
class LRUCache {
    private LinkedHashMap<Integer,Integer> lrumap;
    private int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        lrumap = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (lrumap.containsKey(key)){
            //获取值
            int temp = lrumap.get(key);
            //删除该节点
            lrumap.remove(key);
            //添加到最后
            lrumap.put(key,temp);
            return temp;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (lrumap.containsKey(key)){
            lrumap.remove(key);
            lrumap.put(key,value);
        }else if (lrumap.size()<capacity){
            lrumap.put(key,value);
        }else {
            //删除最近没使用的
            lrumap.remove(lrumap.keySet().toArray()[0]);
            lrumap.put(key,value);
        }
        for (Integer integer : lrumap.keySet()) {
            System.out.println("{"+integer+"-"+lrumap.get(integer)+"}");
        }
        System.out.println("===========");
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2,1);
        lruCache.put(1,1);
        lruCache.put(2,3);
        /*ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(i+2);
        }
        for (Integer integer : a) {
            System.out.println(integer);
        }
        System.out.println("==============");
        a.remove(1);
        for (Integer integer : a) {
            System.out.println(integer);
        }
        System.out.println("==============");
        System.out.println(a.get(3));
        System.out.println("==============");
        for (Integer integer : a) {
            System.out.println(integer);
        }
        a.add(4);
        System.out.println("==============");
        for (Integer integer : a) {
            System.out.println(integer);
        }*/
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
