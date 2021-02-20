package LRU缓存机制146;

import java.util.HashMap;

/**
 * @author zhao peng yu
 * @version 1.0
 * @date 2021/2/18 13:56
 *
 * 基于链表+hashmap
 */
public class LRUCache2 {
    /**
     * 容量
     */
    private int capacity;
    private HashMap<Integer,Node> map;
    /**
     * 构建链表
     */
    private DoubleLinkedList linkedList;
    public LRUCache2(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        linkedList = new DoubleLinkedList();
    }

    public int get(int key) {
        //获取key 更新链表该节点到头部
        if (!map.containsKey(key)){
            return -1;
        }
        int val = map.get(key).val;
        linkedList.removeNode(map.get(key));
        linkedList.addHead(map.get(key));
        return val;
    }

    /**
     * 考虑因素有很多！！！！！！！
     *
     * 1.当put元素存在map中的时候  一定要删除之前的节点 添加更新后val的node添加到链表头
     * 2.当不存在map中的时候
     *                          -》如果链表的长度等于cap
     *                                                就不能直接添加node 需要将链表的尾节点删除，同时删除map中的旧key，添加新的
     *                            小于的话
     *                                                  直接添加
     * @param key
     * @param value
     */
    public void put(int key, int value) {
        if (map.containsKey(key)){
            Node node = map.get(key);
            linkedList.removeNode(node);
            node.val = value;
            linkedList.addHead(node);
        }else {
            if (map.size() == capacity){
                Node node = new Node(key, value);
                linkedList.addHead(node);
                map.remove(linkedList.deleteTail());
                map.put(key,node);
            }else {
                Node node = new Node(key, value);
                linkedList.addHead(node);
                map.put(key,node);
            }
        }

    }
}

/**
 * 构建双向链表节点
 */
class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key,int val){
        this.key = key;
        this.val = val;
    }
}

class DoubleLinkedList{
    Node head;
    Node tail;


    public DoubleLinkedList(){
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public void addHead(Node node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    public int removeNode(Node node){
        int val = node.key;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return val;
    }

    public int deleteTail(){
        if (head.next == tail){
            return -1;
        }
        return removeNode(tail.prev);
    }
}
