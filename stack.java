

import java.util.*;
public class StackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        int[] intArray = new int[]{ -1, 15, 23, 44, 4, 99 };
        for (int var : intArray)
        {
            stack1.push(var);
        }
        Integer element = stack1.peek();
        System.out.println("The stack peek method returns the last element in the stack.");
        System.out.println("The last element in the stack is the first to be removed.");
        System.out.println("By definition, a stack is last in, first out.");
        System.out.println("This is similar to how we store a stack of dinner plates in real life.");
        System.out.println("Element on top of stack1: " + element);

        for(int i = 0; i < intArray.length; i++)
        {
            Integer valFromStack1 = stack1.pop();
            stack2.push(valFromStack1);
            queue.add(valFromStack1);
        }
        System.out.println("\nRemoving elements from stack1 and adding them to stack2 and the queue:");
        for(int i = 0; i < intArray.length; i++) {
            System.out.println("Step "+ i +" : remove " + stack2.pop() + " from stack2 and remove "+ queue.remove() + " from queue");
        }
        System.out.println("\nThe size of stack1 is now: "+ stack2.size());
        System.out.println("The size of stack2 is now: "+ stack2.size());
        System.out.println("The size of the queue is now: "+ queue.size());
    }
}
