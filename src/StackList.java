/**
 * Created by 160306 on 9/25/2017.
 */
public class StackList {

    Node head;
    Node tail;
    int count;

    public StackList() {
        head = null;
        tail = null;
        count = 0;
    }

    public void push(Object data) {
        Node node = new Node(data);
        node.setNextPtr(head);
        head = node;
        if (count == 0)
            tail = node;
        count++;
    }

    public Object pop() {
        Node current = head;
        head = head.getNextPtr();
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

    public boolean contains(Object data) {
        Node current = head;
        for (int i = 0; i < size(); i++) {
            if (current.get().equals(data)) {
                return true;
            } else {
                current = current.getNextPtr();
            }
        }
        return false;
    }

    public StackList copy() {
        // dump content
        Object[] stuff = new Object[size()];
        Node current = head;
        for (int a = stuff.length-1; a >= 0; a--) {
            stuff[a] = current.get();
            current = current.getNextPtr();
        }
        // reload content
        StackList noo = new StackList();
        for (int b = 0; b < stuff.length; b++) {
            noo.push(stuff[b]);
        }
        return noo;
    }

    public StackList reverse() {
        // dump content
        Object[] stuff = new Object[size()];
        Node current = head;
        for (int a = 0; a < stuff.length; a++) {
            stuff[a] = current.get();
            current = current.getNextPtr();
        }
        // reload content
        StackList noo = new StackList();
        for (int b = 0; b < stuff.length; b++) {
            noo.push(stuff[b]);
        }
        return noo;
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
