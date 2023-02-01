package company.a_09_visa;

import java.io.*;
import java.util.stream.IntStream;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}



class Result {

    /*
     * Complete the 'reversingLinkedList' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode reversingLinkedList(SinglyLinkedListNode head) {
        int size =0;
        SinglyLinkedListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        SinglyLinkedListNode node =head;
        for(int i=0;i<size/2;i++){
            node =  reverseBetween(node,  i+1, size-i );
        }
        return node;
    }

    public static  SinglyLinkedListNode reverse(SinglyLinkedListNode node){
        SinglyLinkedListNode prev =null;
        SinglyLinkedListNode current = node;
        while(current!=null){
            SinglyLinkedListNode next = current.next;
            current.next = prev;
            prev=current;
            current=next;
        }
        node = prev;
        return node;
    }
    static  SinglyLinkedListNode reverseBetween(SinglyLinkedListNode head, int m, int n)
    {

        if (m == n)
            return head;

        SinglyLinkedListNode revs = null, revs_prev = null;
        SinglyLinkedListNode revend = null, revend_next = null;


        int i = 1;
        SinglyLinkedListNode curr = head;
        while (curr!=null && i <= n) {
            if (i < m)
                revs_prev = curr;
            if (i == m)
                revs = curr;
            if (i == n) {
                revend = curr;
                revend_next = curr.next;
            }
            curr = curr.next;
            i++;
        }
        revend.next = null;
        // Reverse linked list starting with revs.
        revend = reverse(revs);
        // If starting position was not head
        if (revs_prev!=null)
            revs_prev.next = revend;
            // If starting position was head
        else
            head = revend;
        revs.next = revend_next;
        return head;
    }

}

public class SinglyLinkedListReversal {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList head = new SinglyLinkedList();

        int headCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, headCount).forEach(i -> {
            try {
                int headItem = Integer.parseInt(bufferedReader.readLine().trim());

                head.insertNode(headItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        SinglyLinkedListNode result = Result.reversingLinkedList(head.head);

        SinglyLinkedListPrintHelper.printList(result, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

