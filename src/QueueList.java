/**
 * Created by 160306 on 9/25/2017.
 */
public class QueueList {

    Node head;
    Node tail;
    int count;

    public QueueList() {
        head = null;
        tail = null;
        count = 0;
    }

    public void enqueue(Object data) {
        Node node = new Node(data);
        if (tail != null)
            tail.setNextPtr(node);
        tail = node;
        if (count == 0)
            head = node;
        count++;
    }

    public Object dequeue() {
        Node current = head;
        head = current.getNextPtr();
        count--;

        return current.get();
    }

    public Object peek() {
        return head.get();
    }

    /*public Object get(int index) {
        Node current = head;
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                return current.get();
            } else {
               current = current.getNextPtr();
            }
        }
        return null;

    }*/

    public int size() {
        return count;
    }

    public String toString() {
        String output = "[";
        Node current = head;
        for (int i = 0; i < size(); i++) {
            output += current.get() + ", ";
            current = current.getNextPtr();
        }
        if (size() == 0)
            output += ", ";
        return output.substring(0,output.length()-2) + "]";
    }
}
