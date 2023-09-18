package Stack;

import java.util.*;

public class stackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        /*There are 5 Java Stack function available in Stack class which are:
            push(), 
            pop(), 
            peek(), 
            search(), 
            empty()
        */

        // Pushing elements in the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        // Peeking the top element of the stack
        String element = stack.peek();
        System.out.println("Top element is: " + element);

        // Popping the top element of the stack
         stack.pop();

        // Searching for an element in the stack
        System.out.println("The position of element A in the stack is: " + stack.search("A"));
        System.out.println("The position of element D in the stack is: " + stack.search("D"));

       //Store the poped item 
         String popedItem = stack.pop();
            System.out.println("Poped item is: " + popedItem);
        
        /*Adding item through for loop in a stack

            for(int i=0;i<=4;i++){
                stack.push("E");
            }
            System.out.println("Stack is: " + stack);*/


    }
}
