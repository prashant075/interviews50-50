package company.a_06_playment;

import java.util.HashMap;
import java.util.Map;

public class ReOrderItems {
    class Node {
        Node next;
        int key, val;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    static Map<Integer, Node> map;

    public void build() {
        head = null;
        tail = null;
        size = 0;
        map = new HashMap<>();
    }

    public void addLast(int value) {
        Node newnode = new Node(value);
        newnode.next = null;
        if (this.size >= 1) {
            tail.next = newnode;
        }
        if (this.size == 0) {
            head = newnode;
            tail = newnode;
            this.size++;
        } else {
            tail = newnode;
            this.size++;
        }
        map.put(value, newnode);
    }

    public void addToNext(int a, int b) {
        Node pointLocation = map.get(a);

        if (pointLocation.next != null) {
            int nextVal = pointLocation.next.val;
            boolean overemotional = remove(pointLocation.next);
            if (overemotional) return;
            Node putLocation = map.get(b);
            addAnyLocation(putLocation, nextVal);
        }
    }

    public boolean remove(Node node) {
        Node temp = node.next;
        if (temp == null)
            return false;
        node.val = temp.val;
        node.next = temp.next;
        return true;
    }

    public void addAnyLocation(Node node, int val) {
        Node newnode = new Node(val);
        newnode.next = node.next;
        node.next = newnode;
    }

    public static void main(String[] args) {

        ReOrderItems ordeItems = new ReOrderItems();
        ordeItems.build();
        int[] array = {45, 32, 12, 78, 13};
        for (int val : array) {
            ordeItems.addLast(val);
        }
        Node temp = ordeItems.head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(map);
        System.out.println("******************************************");
        ordeItems.addToNext(78, 13);
        temp = ordeItems.head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println(map);
    }

}
