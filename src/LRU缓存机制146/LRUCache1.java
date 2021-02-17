package LRU缓存机制146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/17 20:41
 */
public class LRUCache1 extends LinkedHashMap {
    private int capacity;
    public LRUCache1(int capacity) {
        super((int) (capacity/0.75)+1,0.75f,true);
        this.capacity = capacity;
    }

    /**
     * 当大于这个数 链表删除老的节点
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>capacity;
    }

    public int get(int key) {
        return (int) getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        super.put(key,value);
    }

    public static void main(String[] args) {
        LRUCache1 lruCache = new LRUCache1(2);
        lruCache.put(2,1);
        lruCache.put(1,1);
        lruCache.put(2,3);
        System.out.println(lruCache);
    }
}
