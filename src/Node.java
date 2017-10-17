/**
 * Created by 160306 on 9/27/2017.
 */
public class Node {

    Object data;
    Node next;
    Node previous;

    public Node() {
        this.data = null;
        next = null;
        previous = null;
    }

    public Node(Object data) {
        this.data = data;
        next = null;
    }

    public void set(Object data) {
        this.data = data;
    }

    public Object get() {
        return data;
    }

    public void setNextPtr(Node next) {
        this.next = next;
    }

    public Node getNextPtr() {
        return next;
    }

    public void setPreviousPtr(Node previous) { this.previous = previous; }

    public Node getPreviousPtr() { return previous; }

    public String toString() {
        return data.toString();
    }

}
