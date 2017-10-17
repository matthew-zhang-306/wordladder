/**
 * Created by 160306 on 10/11/2017.
 */
public class ListTester {

    public static void main(String args[]) {
        System.out.println("THIS IS THE START OF THE THING");

        // Test: Create queue
        QueueList queue = new QueueList();
        System.out.println("Queue has " + queue.size() + " items.");

        // Test: enqueue to queue
        queue.enqueue(1.1);
        queue.enqueue(2.2);
        queue.enqueue(3.3);
        System.out.println("\nEnqueued 3 items to queue.");
        // Prints memory refernce w/o toString override
        System.out.println("Queue contents: " + queue);

        // Test: dequeue queue
        double d = (double)queue.dequeue();
        System.out.println("\nDequeued from front of queue: " + d);
        System.out.println("Queue contents: " + queue);

        // Test: peek/dequeue to queue
        queue.enqueue(1.1);
        queue.enqueue(2.2);
        queue.enqueue(3.3);
        System.out.println("\nEnqueued 3 items to queue.");
        System.out.println("Queue contents: " + queue);
        System.out.println("Peeked from front of queue: " + queue.peek());
        double d1 = (double)queue.dequeue();
        double d2 = (double)queue.dequeue();
        System.out.println("Dequeued from front of queue: " + d1);
        System.out.println("Dequeued again from front of queue: " + d2);
        System.out.println("\nPeeked from front of queue: " + queue.peek());
        System.out.println("Queue contents: " + queue);



        System.out.println("\n\nTHIS IS THE START OF THE THING");

        // Test: Create stack
        StackList stack = new StackList();
        System.out.println("Stack has " + stack.size() + " items.");

        // Test: push to stack
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        System.out.println("\nPushed 3 items to stack.");
        // Prints memory refernce w/o toString override
        System.out.println("Stack contents: " + stack);

        // Test: pop stack
        double s = (double)stack.pop();
        System.out.println("\nPopped from top of stack: " + s);
        System.out.println("Stack contents: " + stack);

        // Test: peek/pop to stack
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        System.out.println("\nPushed 3 items to stack.");
        System.out.println("Stack contents: " + stack);
        System.out.println("Peeked from top of stack: " + stack.peek());
        double s1 = (double)stack.pop();
        double s2 = (double)stack.pop();
        System.out.println("Popped from top of stack: " + s1);
        System.out.println("Popped again from top of stack: " + s2);
        System.out.println("\nPeeked from top of stack: " + stack.peek());
        System.out.println("Stack contents: " + stack);

    }
}
