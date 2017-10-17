import java.io.*;
import java.util.*;

/**
 * Needs to run way faster than it currently does
 */
public class WordLadder {

    public static void main(String args[]) {
        Scanner scan = null;




        // accept input from input.txt
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while (scan.hasNext()) {
            String in = scan.next();
            String out = scan.next();
            HashSet<String> dictionary = new HashSet<String>();


            // algorithm:
            boolean found = false;
            StackList temp = null;
            StackList thisstack = null;
            StackList thatstack = null;
            // create a queue made with a linked list of stacks made with linked lists
            QueueList queue = new QueueList();
            StackList stack = new StackList();
            // start the queue with a stack of just the input word
            stack.push(in);
            queue.enqueue(stack);
            // while output not found and queue is not empty:
            if (in.length() == out.length()) {
                // set up dictionary input
                Scanner dict = null;
                try {
                    dict = new Scanner(new File("dictionary.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                // accept input into dictionary
                while (dict.hasNext()) {
                    String word = dict.next();
                    if (word.length() == in.length())
                        dictionary.add(word);
                }

                if (!dictionary.contains(in) || !dictionary.contains(out))
                    queue.dequeue();

                while (!found && queue.size() > 0) {
                    // dequeue the stack at the front
                    temp = (StackList) queue.dequeue(); /*NEEDS SHALLOW COPY*/
                    thisstack = temp.copy();
                    thatstack = thisstack;
                    String top = (String) thisstack.peek();
                    // if top of stack matches out, answer is found
                    if (top.equals(out))
                        found = true;
                        // else, find N possible next words:
                    else {
                        // for every word one letter away from the top of the stack
                        for (int i = 0; i < in.length(); i++) {
                            for (int j = 0; j < 26; j++) {
                                String next = top.substring(0, i) + (char) (97 + j) + top.substring(i + 1, in.length());
                                // if in stack, do nothing
                                // if in dictionary, push the word and enqueue the stack
                                if (!thisstack.contains(next) && dictionary.contains(next)) {
                                    thatstack = thisstack.copy(); /*NEEDS SHALLOW COPY*/
                                    thatstack.push(next);
                                    if (next.equals(out)) {
                                        found = true;
                                        break;
                                    } else {
                                        queue.enqueue(thatstack);
                                        dictionary.remove(next);
                                    }
                                }
                                // else, do nothing
                            }
                            if (found)
                                break;
                        }
                    }
                    //System.out.println(thatstack);
                }
            }
            // return the stack or return nothing
            if (found)
                System.out.println(thatstack.reverse());
            else
                System.out.println("There is no word ladder between " + in + " and " + out + "!");
        }
    }

}
