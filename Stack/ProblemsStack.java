package Stack;

import java.util.*;
/*Create a stack and push each character of the string onto the stack.
Create a new string and pop each character from the stack and append it to the new string.
Return the new string. */
public class ProblemsStack {

    public static void main(String[] args) {
        String str="Hello, world!";
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String reverse="";
        while(!stack.empty()){
            reverse=reverse+stack.pop();
        }
        System.out.println(reverse);

    }
}
